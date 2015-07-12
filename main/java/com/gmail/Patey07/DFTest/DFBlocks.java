package com.gmail.Patey07.DFTest;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DFBlocks {
	
    public static Block Chalk;

    public static void createBlocks() {
    	GameRegistry.registerBlock(Chalk = new BasicBlock("Chalk").setLightLevel(1.0f), "Chalk");
    }
}
