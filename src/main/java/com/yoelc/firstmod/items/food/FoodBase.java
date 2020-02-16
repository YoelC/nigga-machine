package com.yoelc.firstmod.items.food;

import com.yoelc.firstmod.Main;
import com.yoelc.firstmod.init.ModItems;
import com.yoelc.firstmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import static com.yoelc.firstmod.Main.NIGGA_MACHINE_TAB;

public class FoodBase extends ItemFood implements IHasModel {

    public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
        super(amount, saturation, isAnimalFood);
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
