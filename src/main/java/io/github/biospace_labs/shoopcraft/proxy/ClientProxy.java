package io.github.biospace_labs.shoopcraft.proxy;

import io.github.biospace_labs.shoopcraft.ShoopCraft;
import io.github.biospace_labs.shoopcraft.init.ModBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ShoopCraft.MODID + ":" + id, "inventory"));
    }
    public void init() {
        ModBlocks.registerRenders();
    }
}
