package com.yoelc.firstmod.tabs;

import com.yoelc.firstmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NiggaMachineTab extends CreativeTabs {
    public NiggaMachineTab(String label) {
        super(label);

    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.NIGGA_MACHINE, 1);
    }

}
