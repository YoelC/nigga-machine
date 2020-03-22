package com.yoelc.firstmod.util.handler;

import com.yoelc.firstmod.math.Vector2D;
import com.yoelc.firstmod.math.Vector3D;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.input.Keyboard;

import static java.lang.Math.max;

public class BhopEventHandler {

    public float airAccel = 0.15f;
    public float airMax = 0.003f;
    public float groundMax = 3f;
    public float friction = 0.6f;
    public float groundAccel = 0.13f;

    public Vector3D vel = new Vector3D();
    public Vector3D prevVel = new Vector3D();

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {

        if (event.phase == TickEvent.Phase.START && event.side == Side.CLIENT) {
            vel.x = prevVel.x;
            vel.z = prevVel.z;

            vel = calculateFriction(event);

            if (event.player.onGround) {
                vel = vel.add(moveGround(event));
            } else {
                vel = vel.add(moveAir(event));
            }

            event.player.motionX = vel.x;
            event.player.motionZ = vel.z;
            prevVel.x = vel.x;
            prevVel.z = vel.z;
        }
    }

    public Vector3D calculateFriction(TickEvent.PlayerTickEvent event) {
        if (event.player.onGround) {
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
        Vector3D wishvel = getWishvel(event).scale(accelerate);
        float max = Math.max(0, 1 - vel.length() / maxVel);
        float projVel = vel.dot(wishvel);
        Vector3D scaledWishvel = wishvel.scale(max);
        Vector3D lerp = wishvel.lerp(scaledWishvel, 1 / projVel);
        return lerp;
    }

    public Vector3D moveAir(TickEvent.PlayerTickEvent event) {
        return accelerate(event, airAccel, airMax);

    }

    public Vector3D moveGround(TickEvent.PlayerTickEvent event) {
        return accelerate(event, groundAccel, groundMax);
    }

}