package com.yoelc.firstmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NiggaMachineOre extends BlockBase {

    public NiggaMachineOre(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(10.0f);
        setResistance(300.0f);
        setHarvestLevel("pickaxe", 3);
    }
}