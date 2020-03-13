package com.yoelc.firstmod.util.handler;

import com.yoelc.firstmod.math.Vector2D;
import com.yoelc.firstmod.proxy.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.input.Keyboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

import static java.lang.Math.max;

public class BhopEventHandler {

    public boolean onGroundLastTick = false;
    public float airAccel = 15f;
    public float airMax = 0.1f;
    public float groundMax = 0.3f;
    public float friction = 0.8f;
    public float groundAccel = 0.13f;

    public Vector2D vel = new Vector2D();
    public Vector2D prevVel = new Vector2D();
    public boolean jumping = false;

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {

        // Auto Bhop
        jumping = Keyboard.isKeyDown(Keyboard.KEY_SPACE);
        if (jumping && event.player.onGround) {
            event.player.jump();
        }

        if (event.phase == TickEvent.Phase.START && event.side == Side.CLIENT) {
            vel.x = prevVel.x;
            vel.y = prevVel.y;

            Vector2D newVel;

            if (getOnGround(event)) {
                newVel = moveGround(event);
            } else {
                newVel = moveAir(event);
            }

            event.player.motionX = newVel.x;
            event.player.motionZ = newVel.y;
            prevVel.x = newVel.x;
            prevVel.y = newVel.y;
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

    public Vector2D getWishvel(TickEvent.PlayerTickEvent event) {
        float angle = (float) (event.player.rotationYaw);
        Vector2D wishpos = new Vector2D(event.player.moveStrafing, event.player.moveForward).rotate(angle * (3.14159f / 180f));
        return wishpos;
    }

    public Vector2D accelerate(TickEvent.PlayerTickEvent event, float accelerate, float maxVel) {
        Vector2D wishpos = getWishvel(event);
        float projVel = vel.dotProduct(wishpos);

        float accelVel = accelerate;

        if (accelerate + projVel > maxVel) {
            accelVel = maxVel - projVel;
        }


        return vel.add(wishpos.scale(accelVel));
    }

    public Vector2D moveAir(TickEvent.PlayerTickEvent event) {
        return accelerate(event, airAccel, airMax);
    }

    public Vector2D moveGround(TickEvent.PlayerTickEvent event) {
        float speed = vel.length();
        if (speed != 0) {
            float drop = speed * friction;
            vel = vel.scale(max(speed - drop, 0) / speed);
        }

        return accelerate(event, groundAccel, groundMax);
    }

    @SubscribeEvent
    public void onPlayerJump(LivingEvent.LivingJumpEvent event) {
        EntityPlayer player = Minecraft.getMinecraft().player;
        if(event.getEntity() == player) {
        }
    }
}