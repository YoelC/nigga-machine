package com.yoelc.firstmod.util.handler;

import com.yoelc.firstmod.entity.EntityNiggaMachine;
import com.yoelc.firstmod.entity.render.RenderNiggaMachine;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import javax.swing.text.html.parser.Entity;

public class RenderHandler {
    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityNiggaMachine.class, new IRenderFactory<EntityNiggaMachine>() {

            @Override
            public Render<? super EntityNiggaMachine> createRenderFor(RenderManager manager) {
                return new RenderNiggaMachine(manager);
            }
        });
    }
}
