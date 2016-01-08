package com.bradg19.testmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.bradg19.testmod.help.*;
import com.bradg19.testmod.init.ModBlocks;
import com.bradg19.testmod.init.ModItems;
import com.bradg19.testmod.proxies.*;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TestMod {

	@Instance(Reference.MODID)
	public static TestMod instance; // needs to be the name of your class
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenderers();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}

}
