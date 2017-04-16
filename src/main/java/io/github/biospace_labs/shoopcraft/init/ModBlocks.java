package io.github.biospace_labs.shoopcraft.init;

import io.github.biospace_labs.shoopcraft.block.BlockSpooler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Kevin on 2017-04-16.
 */
public class ModBlocks {

    public static Block spooler;

    public static void init() {
        spooler = new BlockSpooler();
    }

    public static void register() {
        GameRegistry.register(spooler);
    }

    public static void registerRenders() {
        registerRender(spooler);
    }

    private static void registerRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
