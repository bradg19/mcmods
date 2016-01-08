package com.bradg19.testmod.proxies;

import com.bradg19.testmod.init.ModBlocks;
import com.bradg19.testmod.init.ModItems;

public class ClientProxy extends CommonProxy {
	
    @Override
    public void registerRenderers()
    {
    	ModItems.registerItemRenderer();
    	ModBlocks.registerBlockRenderer();
    }
}
