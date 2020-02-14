package com.yoelc.firstmod.init;

import com.yoelc.firstmod.items.ItemBase;
import com.yoelc.firstmod.items.armor.ArmorBase;
import com.yoelc.firstmod.items.tools.*;
import com.yoelc.firstmod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Materials
    public static final Item.ToolMaterial MATERIAL_NIGGA_MACHINE = EnumHelper.addToolMaterial(
            "material_nigga_machine",
            3,
            3000,
            10.0f,
            5.0f,
            50);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_NIGGA_MACHINE = EnumHelper.addArmorMaterial(
            "armor_material_nigga_machine",
            Reference.MOD_ID + ":nigga_machine",
            20,
            new int[] {3, 7, 9, 4},
            50,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0f);

    // Items
    public static final Item NIGGA_MACHINE = new ItemBase("nigga_machine");
    public static final Item NIGGA_MACHINE_STICK = new ItemBase("nigga_machine_stick");
    public static final Item NIGGA_MACHINE_EYES = new ItemBase("nigga_machine_eye");

    // Tools
    public static final ItemSword NIGGA_MACHINE_SWORD = new ToolSword("nigga_machine_sword", MATERIAL_NIGGA_MACHINE);
    public static final ItemSpade NIGGA_MACHINE_SHOVEL = new ToolSpade("nigga_machine_shovel", MATERIAL_NIGGA_MACHINE);
    public static final ItemPickaxe NIGGA_MACHINE_PICKAXE = new ToolPickaxe("nigga_machine_pickaxe", MATERIAL_NIGGA_MACHINE);
    public static final ItemAxe NIGGA_MACHINE_AXE = new ToolAxe("nigga_machine_axe", MATERIAL_NIGGA_MACHINE);
    public static final ItemHoe NIGGA_MACHINE_HOE = new ToolHoe("nigga_machine_hoe", MATERIAL_NIGGA_MACHINE);

    // Armor
    public static final Item NIGGA_MACHINE_HELMET = new ArmorBase(
            "nigga_machine_helmet",
            ARMOR_MATERIAL_NIGGA_MACHINE,
            1,
            EntityEquipmentSlot.HEAD);

    public static final Item NIGGA_MACHINE_CHESTPLATE = new ArmorBase(
            "nigga_machine_chestplate",
            ARMOR_MATERIAL_NIGGA_MACHINE,
            1,
            EntityEquipmentSlot.CHEST);
    ;
    public static final Item NIGGA_MACHINE_LEGGINGS = new ArmorBase(
            "nigga_machine_leggings",
            ARMOR_MATERIAL_NIGGA_MACHINE,
            2,
            EntityEquipmentSlot.LEGS);
    ;
    public static final Item NIGGA_MACHINE_BOOTS = new ArmorBase(
            "nigga_machine_boots",
            ARMOR_MATERIAL_NIGGA_MACHINE,
            1,
            EntityEquipmentSlot.FEET);
    ;

}
