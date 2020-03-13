package com.yoelc.firstmod.items.tools;

import com.yoelc.firstmod.Main;
import com.yoelc.firstmod.init.ModItems;
import com.yoelc.firstmod.items.special.NiggaMachineArrow;
import com.yoelc.firstmod.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

import static com.yoelc.firstmod.Main.NIGGA_MACHINE_TAB;

public class NiggaMachineBow extends ItemBow implements IHasModel {

    public NiggaMachineBow(String name)  {
        super();
        setMaxDamage(1024);
        setMaxStackSize(1);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NIGGA_MACHINE_TAB);
        ModItems.ITEMS.add(this);
    }

    @Override
    protected boolean isArrow(ItemStack stack)
    {
        return stack.getItem() instanceof NiggaMachineArrow;
    }

    @Override
    protected ItemStack findAmmo(EntityPlayer player)
    {
        if (this.isArrow(player.getHeldItem(EnumHand.OFF_HAND)))
        {
            return player.getHeldItem(EnumHand.OFF_HAND);
        }
        else if (this.isArrow(player.getHeldItem(EnumHand.MAIN_HAND)))
        {
            return player.getHeldItem(EnumHand.MAIN_HAND);
        }
        else
        {
            for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
            {
                ItemStack itemstack = player.inventory.getStackInSlot(i);

                if (this.isArrow(itemstack))
                {
                    return itemstack;
                }
            }

            return ItemStack.EMPTY;
        }
    }

    @Override
    public EntityArrow customizeArrow(EntityArrow arrow) {
        arrow.setDamage((arrow.getDamage() * 2.0d));
        arrow.setVelocity(arrow.motionX * 10.0d, arrow.motionY * 10.0d, arrow.motionZ * 10.0d);
        arrow.setNoGravity(true);
        return arrow;
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }


}



