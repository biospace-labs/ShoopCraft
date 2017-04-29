package io.github.biospace_labs.shoopcraft.block;

import io.github.biospace_labs.shoopcraft.ShoopCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Kevin on 2017-04-16.
 */
public class BlockSpooler extends Block {
    public BlockSpooler() {
        super(Material.WOOD);
        setUnlocalizedName(ShoopCraft.ShoopcraftBlocks.spooler.getUnlocalisedName());
        setRegistryName(ShoopCraft.ShoopcraftBlocks.spooler.getRegistryName());
    }
}
