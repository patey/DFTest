package com.gmail.Patey07.DFTest;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(name = DFTest.MODNAME, modid = DFTest.MODID, version = DFTest.VERSION)
public class DFTest{
	
    public static final String MODID = "DFTest";
    public static final String MODNAME = "Dwarf Fortress Test";
    public static final String VERSION = "0.0.1";
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	DFBlocks.createBlocks();
        System.out.println("DFTest Loaded..");
    }
}