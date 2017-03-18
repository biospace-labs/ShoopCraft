package io.github.biospace_labs.shoopcraft;

import io.github.biospace_labs.shoopcraft.item.ItemRegisterer;
import io.github.biospace_labs.shoopcraft.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid=ShoopCraft.MODID, name=ShoopCraft.NAME, version=ShoopCraft.VERSION)
public class ShoopCraft {
    public static final String MODID = "shoopcraft";
    public static final String NAME = "ShoopCraft";
    public static final String VERSION = "1.0";

    @SidedProxy(serverSide = "io.github.biospace_labs.shoopcraft.proxy.CommonProxy", clientSide = "io.github.biospace_labs.shoopcraft.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("SHOOPCRAFT: Initializing");
    }
}