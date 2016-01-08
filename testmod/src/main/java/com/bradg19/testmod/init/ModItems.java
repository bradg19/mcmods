package com.bradg19.testmod.init;

import com.bradg19.testmod.help.RegisterHelper;
import com.bradg19.testmod.items.ItemModShovel;
//import com.bradg19.testmod.items.ItemTank;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItems {

	//public static Item tank = new ItemTank().setUnlocalizedName("tank");
	public static ToolMaterial ModShovelMaterial = EnumHelper.addToolMaterial("item_mod_shovel", 2, 250, 6.0F, 2.0F, 14);
	public static Item ModShovel = (new ItemModShovel("item_mod_shovel", ModShovelMaterial));
	
	public static void registerItems()
	{
		//RegisterHelper.registerItem(tank);
		RegisterHelper.registerItem(ModShovel);
	}

	public static void registerItemRenderer()
	{
		//RegisterHelper.registerItemRenderer(tank);
		RegisterHelper.registerItemRenderer(ModShovel);
	}
	
}
