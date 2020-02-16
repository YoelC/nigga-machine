package com.yoelc.firstmod.entity.render;

import com.yoelc.firstmod.entity.EntityNiggaMachine;
import com.yoelc.firstmod.entity.models.ModelNiggaMachine;
import com.yoelc.firstmod.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNiggaMachine extends RenderLiving<EntityNiggaMachine> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/nigga_machine.png");

    public RenderNiggaMachine(RenderManager manager) {
        super(manager, new ModelNiggaMachine(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityNiggaMachine entity) {
        return TEXTURES;

    }
}
