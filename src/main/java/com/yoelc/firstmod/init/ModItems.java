package com.yoelc.firstmod.init;

import com.yoelc.firstmod.items.ItemBase;
import com.yoelc.firstmod.items.tools.ToolSpade;
import com.yoelc.firstmod.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Materials
    public static final Item.ToolMaterial MATERIAL_NIGGA_MACHINE = EnumHelper.addToolMaterial("material_nigga_machine", 3, 3000, 10.0f, 5.0f, 50);

    // Items
    public static final Item NIGGA_MACHINE = new ItemBase("nigga_machine");
    public static final Item NIGGA_MACHINE_STICK = new ItemBase("nigga_machine_stick");

    // Tools
    public static final ItemSword NIGGA_MACHINE_SWORD = new ToolSword("nigga_machine_sword", MATERIAL_NIGGA_MACHINE);
    public static final ItemSpade NIGGA_MACHINE_SHOVEL = new ToolSpade("nigga_machine_shovel", MATERIAL_NIGGA_MACHINE);


}
