package com.yoelc.firstmod.init;

import com.yoelc.firstmod.Main;
import com.yoelc.firstmod.entity.EntityNiggaMachine;
import com.yoelc.firstmod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

    public static void registerEntities() {
        RegisterEntity("nigga_machine", EntityNiggaMachine.class, Reference.ENTITY_NIGGA_MACHINE, 50, 0, 16777215);
    }

    private static void RegisterEntity(String name, Class<? extends Entity> Entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(
                new ResourceLocation(Reference.MOD_ID + ":" + name),
                Entity,
                name,
                id,
                Main.instance,
                range,
                1,
                true,
                color1,
                color2);
    }
}
