package com.erock112233.TUM;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TUM.MODID, name = TUM.MODNAME, version = TUM.VERSION)
public class TUM {
	public static final String MODID = "TUM";
	public static final String MODNAME = "TUM";
	public static final String VERSION = "0.001";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
