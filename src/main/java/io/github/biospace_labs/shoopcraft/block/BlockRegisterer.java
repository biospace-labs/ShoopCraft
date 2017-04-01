package io.github.biospace_labs.shoopcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class BlockRegisterer {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        Block steelWoolBlock = new Block(Material.SPONGE);

        steelWoolBlock.setRegistryName("steelwoolblock");
        steelWoolBlock.setUnlocalizedName("steelwoolblock");
        steelWoolBlock.setLightLevel(1f);

        GameRegistry.register(steelWoolBlock);

        Block spooler = new Block(Material.WOOD);

        spooler.setRegistryName("spooler");
        spooler.setUnlocalizedName("spooler");
        spooler.setCreativeTab(CreativeTabs.MISC);

        GameRegistry.register(spooler);

        ItemBlock spoolerIB = new ItemBlock(spooler);
        spoolerIB.setRegistryName(spooler.getRegistryName());

        GameRegistry.register(spoolerIB);





    }
}
