package com.bradg19.testmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemModShovel extends ItemHoe {

	public ItemModShovel(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("item_mod_shovel");
	    this.setCreativeTab(CreativeTabs.tabTools);
	}

}
