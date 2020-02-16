package com.yoelc.firstmod.items.tools;

import com.yoelc.firstmod.Main;
import com.yoelc.firstmod.init.ModItems;
import com.yoelc.firstmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

import static com.yoelc.firstmod.Main.NIGGA_MACHINE_TAB;

public class NiggaMachinePickaxe extends ItemPickaxe implements IHasModel {
    public NiggaMachinePickaxe(String name, Item.ToolMaterial material)  {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NIGGA_MACHINE_TAB);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
