package com.yoelc.firstmod.items.tools;

import com.yoelc.firstmod.Main;
import com.yoelc.firstmod.init.ModItems;
import com.yoelc.firstmod.util.IHasModel;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;

import static com.yoelc.firstmod.Main.NIGGA_MACHINE_TAB;

public class NiggaMachineShears extends ItemShears implements IHasModel {

    public NiggaMachineShears(String name) {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NIGGA_MACHINE_TAB);
        setMaxDamage(255);

        ModItems.ITEMS.add(this);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack itemStackCopy = itemStack.copy();
        itemStackCopy.setItemDamage(itemStackCopy.getItemDamage() + 128);
        return itemStackCopy;
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
