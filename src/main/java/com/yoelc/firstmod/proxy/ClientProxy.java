package com.yoelc.firstmod.proxy;

import com.yoelc.firstmod.util.handler.BhopEventHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    public static void registerBusEvents() {
        BhopEventHandler handler = new BhopEventHandler();
        MinecraftForge.EVENT_BUS.register(new BhopEventHandler());
        FMLCommonHandler.instance().bus().register(handler);

    }
}
