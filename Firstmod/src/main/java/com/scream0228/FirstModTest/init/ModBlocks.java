package com.scream0228.FirstModTest.init;

import java.util.ArrayList;
import java.util.List;

import com.scream0228.FirstModTest.Blocks.BlockBase;
import com.scream0228.FirstModTest.Blocks.RubyBlock;
import com.scream0228.FirstModTest.Blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block Ruby_Block = new RubyBlock("ruby_block", Material.IRON);
	
	public static final Block Ruby_Ore = new RubyOre("ruby_ore", Material.IRON);
	
}
