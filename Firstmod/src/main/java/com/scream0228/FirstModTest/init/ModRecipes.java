package com.scream0228.FirstModTest.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{

	public static void init()
	{
		
		GameRegistry.addSmelting(ModBlocks.Ruby_Ore, new ItemStack(ModItems.RUBY, 1), 5.0f);
		GameRegistry.addSmelting(ModBlocks.Ruby_Block, new ItemStack(Blocks.DIAMOND_BLOCK, 1), 1000000.0f);
		
	}
	
}
