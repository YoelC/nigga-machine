package com.yoelc.firstmod.items.special;

import com.yoelc.firstmod.Main;
import com.yoelc.firstmod.init.ModItems;
import com.yoelc.firstmod.items.ItemBase;
import com.yoelc.firstmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;

import static com.yoelc.firstmod.Main.NIGGA_MACHINE_TAB;

public class NiggaMachineArrow extends ItemArrow implements IHasModel {

    public NiggaMachineArrow() {
        super();
        setUnlocalizedName("nigga_machine_arrow");
        setRegistryName("nigga_machine_arrow");
        setCreativeTab(NIGGA_MACHINE_TAB);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
