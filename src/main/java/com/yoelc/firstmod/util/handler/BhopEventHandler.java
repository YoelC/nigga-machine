package com.yoelc.firstmod.util.handler;

import com.yoelc.firstmod.math.Vector2D;
import com.yoelc.firstmod.math.Vector3D;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.input.Keyboard;

import static java.lang.Math.max;

public class BhopEventHandler {

    public boolean onGroundLastTick = false;
    public float airAccel = 1f;
    public float airMax = 0.01f;
    public float groundMax = 0.03f;
    public float friction = 0.4f;
    public float groundAccel = 0.13f;

    public Vector3D vel = new Vector3D();
    public Vector3D prevVel = new Vector3D();
    public boolean jumping = false;

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {

        // Auto Bhop
        jumping = Keyboard.isKeyDown(Keyboard.KEY_SPACE);
        if (jumping && event.player.onGround)  {
            event.player.jump();
        }

        if (event.phase == TickEvent.Phase.START && event.side == Side.CLIENT) {
            vel.x = prevVel.x;
            vel.z = prevVel.z;

            vel = calculateFriction(event);

            if (getOnGround(event)) {
                vel = vel.add(moveGround(event));
            } else {
                vel = vel.add(moveAir(event));
            }

            event.player.motionX = vel.x / 5;
            event.player.motionZ = vel.z / 5;
            prevVel.x = vel.x;
            prevVel.z = vel.z;
        }
    }

    public boolean getOnGround(TickEvent.PlayerTickEvent event) {
        if(event.player.onGround && !onGroundLastTick) {
            onGroundLastTick = true;
            return false;

        }

        else if(event.player.onGround && onGroundLastTick) {
            return true;
        }

        else if(!event.player.onGround) {
            onGroundLastTick = false;
            return false;

        }

        return false;
    }

    public Vector3D calculateFriction(TickEvent.PlayerTickEvent event) {
        if (getOnGround(event)) {
            vel = vel.scale(friction);
        }
        return vel;
    }

    public Vector3D getWishvel(TickEvent.PlayerTickEvent event) {
        Vector3D wishvel = new Vector3D(event.player.moveForward, 0f, event.player.moveStrafing).rotateY((event.player.rotationYaw) * (3.14159f / 180f));
        float temp = wishvel.x;
        wishvel.x = wishvel.z;
        wishvel.z = temp;
        return wishvel;

    }

    public Vector3D accelerate(TickEvent.PlayerTickEvent event, float accelerate, float maxVel) {
        Vector3D wishvel = getWishvel(event);
        float max = Math.max(0, 1 - vel.length() / maxVel);
        System.out.println(max);
        float projVel = vel.dot(wishvel);
        Vector3D scaledWishvel = wishvel.scale(max);
        return wishvel.lerp(scaledWishvel, projVel);
    }

    public Vector3D moveAir(TickEvent.PlayerTickEvent event) {
        return accelerate(event, airAccel, airMax);

    }

    public Vector3D moveGround(TickEvent.PlayerTickEvent event) {
        return accelerate(event, groundAccel, groundMax);
    }

}