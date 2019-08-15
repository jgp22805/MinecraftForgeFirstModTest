package com.scream0228.FirstModTest.Blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyOre extends BlockBase
{

	public RubyOre(String name, Material material)
	{
		
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.2f);
		//setLightOpacity(1);
		//setBlockUnbreakable()
		
		
	}
	
}
