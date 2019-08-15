package com.scream0228.FirstModTest.items.tools;

import com.scream0228.FirstModTest.Main;
import com.scream0228.FirstModTest.init.ModItems;
import com.scream0228.FirstModTest.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel
{

	public ToolAxe(String name, ToolMaterial material) 
	{
		super(material, 6.0F, -3.2F);
	
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	

	@Override
	public void registerModels() 
	{
	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
