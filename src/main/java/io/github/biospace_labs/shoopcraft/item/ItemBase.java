package io.github.biospace_labs.shoopcraft.item;

import io.github.biospace_labs.shoopcraft.ShoopCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        ShoopCraft.proxy.registerItemRenderer(this, 0, name);
    }

//    @Override
//    public ItemBase setCreativeTab(CreativeTabs tab) {
//        super.setCreativeTab(tab);
//        return this;
//    }
}
