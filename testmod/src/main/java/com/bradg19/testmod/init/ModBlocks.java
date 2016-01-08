package com.bradg19.testmod.init;

import com.bradg19.testmod.blocks.BlockTestMod;
import com.bradg19.testmod.help.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block citrine_block = new BlockTestMod(1.0F, 3.0F, "pickaxe", 1, 0F).setUnlocalizedName("citrine_block");
	
	public static void registerBlocks()
	{
		RegisterHelper.registerBlock(citrine_block);
	}

	public static void registerBlockRenderer()
	{
		RegisterHelper.registerBlockRenderer(citrine_block);
	}
	
}
