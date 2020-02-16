package com.yoelc.firstmod.items.tools;

import com.yoelc.firstmod.Main;
import com.yoelc.firstmod.init.ModItems;
import com.yoelc.firstmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import static com.yoelc.firstmod.Main.NIGGA_MACHINE_TAB;

public class NiggaMachineAxe extends ItemAxe implements IHasModel {

    public NiggaMachineAxe(String name, ToolMaterial material)  {
        super(material, 12.0f, -3.4f);
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
