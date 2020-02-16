package com.yoelc.firstmod;

import com.yoelc.firstmod.init.ModRecipes;
import com.yoelc.firstmod.proxy.CommonProxy;
import com.yoelc.firstmod.tabs.NiggaMachineTab;
import com.yoelc.firstmod.util.Reference;
import com.yoelc.firstmod.util.handler.RegistryHandler;
import com.yoelc.firstmod.util.handler.RenderHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main {

    public static final CreativeTabs NIGGA_MACHINE_TAB = new NiggaMachineTab("nigga_machine_tab");

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries();
        RenderHandler.registerEntityRenders();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @EventHandler
    public static void Postinit(FMLPostInitializationEvent event) {
    }
}
