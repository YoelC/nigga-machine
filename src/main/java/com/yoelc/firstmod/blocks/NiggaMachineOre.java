package com.yoelc.firstmod.blocks;

import ibxm.Player;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.storage.loot.ILootContainer;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class NiggaMachineOre extends BlockBase {

    public NiggaMachineOre(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(10.0f);
        setResistance(300.0f);
        setHarvestLevel("pickaxe", 3);
    }
}