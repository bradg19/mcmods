package com.bradg19.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTestMod extends Block {
	
	public BlockTestMod(float hardness, float resistance, String harvestType, int harvestLevel, float lightLevel)
    {
        super(Material.rock); // experiment with different material types
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundTypeStone);
        this.setHardness(hardness); // how long it takes to break
        this.setResistance(resistance); // resistance to explosives
        this.setHarvestLevel(harvestType, harvestLevel); // what can break/what material can break
        this.setLightLevel(lightLevel); // light emitted (e.g. glowstone)
    }

}
