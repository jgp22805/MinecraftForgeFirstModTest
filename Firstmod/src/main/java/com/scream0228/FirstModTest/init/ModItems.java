package com.scream0228.FirstModTest.init;

import java.util.ArrayList; 
import java.util.List;

import com.scream0228.FirstModTest.items.ItemBase;
import com.scream0228.FirstModTest.items.tools.LightningBolt;
import com.scream0228.FirstModTest.items.tools.ToolAxe;
import com.scream0228.FirstModTest.items.tools.ToolHoe;
import com.scream0228.FirstModTest.items.tools.ToolPickaxe;
import com.scream0228.FirstModTest.items.tools.ToolShovel;
//import com.scream0228.FirstModTest.items.tools.ToolAxe;
//import com.scream0228.FirstModTest.items.tools.ToolHoe;
//import com.scream0228.FirstModTest.items.tools.ToolPickaxe;
//import com.scream0228.FirstModTest.items.tools.ToolShovel;
import com.scream0228.FirstModTest.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List <Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_LIGHTNING = EnumHelper.addToolMaterial("material_lightning", 1, 250, 1.0F, 0.1F, 10);
	
	
	
	//Items
	
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item PLUG = new ItemBase("plug");
	
	//Tools
	
public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
public static final ItemSpade RUBY_SHOVEL = new ToolShovel("ruby_shovel", MATERIAL_RUBY);
public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
public static final ItemSword LIGHTNING_BOLT = new LightningBolt("lightning_bolt", MATERIAL_LIGHTNING);
			
}
