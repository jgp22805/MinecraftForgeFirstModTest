package com.scream0228.FirstModTest.items;

import com.scream0228.FirstModTest.Main;
import com.scream0228.FirstModTest.init.ModItems;
import com.scream0228.FirstModTest.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PlugBase extends Item implements IHasModel
{

	public PlugBase(String name) 
	{
	
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	

	@Override
	public void registerModels() 
	{
	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
