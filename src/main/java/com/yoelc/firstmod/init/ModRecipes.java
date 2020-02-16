package com.yoelc.firstmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        GameRegistry.addSmelting(ModBlocks.NIGGA_MACHINE_ORE, new ItemStack(ModItems.NIGGA_MACHINE, 1), 50f);
        GameRegistry.addSmelting(ModItems.NIGGA_MACHINE, new ItemStack(ModItems.COOKED_NIGGA_MACHINE, 1), 50);
    }
}
