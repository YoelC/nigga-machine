package com.yoelc.firstmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.ILootContainer;

public class NiggaMachineBlock extends BlockBase {
    public NiggaMachineBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.METAL);
        setHardness(10.0f);
        setResistance(300.0f);
        setHarvestLevel("pickaxe", 3);

    }

}
