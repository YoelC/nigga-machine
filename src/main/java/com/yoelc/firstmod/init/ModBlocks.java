package com.yoelc.firstmod.init;

import com.yoelc.firstmod.blocks.NiggaMachineBlock;
import com.yoelc.firstmod.blocks.NiggaMachineOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block NIGGA_MACHINE_BLOCK = new NiggaMachineBlock("nigga_machine_block", Material.IRON);
    public static final Block NIGGA_MACHINE_ORE = new NiggaMachineOre("nigga_machine_ore", Material.ROCK);
}
