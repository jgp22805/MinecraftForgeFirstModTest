package com.scream0228.FirstModTest.items.tools;

import java.awt.Event;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.SwingUtilities;

import org.lwjgl.input.Mouse;

import com.scream0228.FirstModTest.Main;
import com.scream0228.FirstModTest.init.ModItems;
import com.scream0228.FirstModTest.util.IHasModel;

import ibxm.Player;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class LightningBolt extends ItemSword implements IHasModel
{
	World world;
	/*
	 * World world; EntityPlayer player; //Vector vec3 = new Vector();
	 * //ClientTickEvent evnt = new ClientTickEvent(null); float f = 1.0f;
	 * 
	 * float f1 = player.prevRotationPitch + (player.rotationPitch -
	 * player.prevRotationPitch) * f; float f2 = player.prevRotationYaw +
	 * (player.rotationYaw - player.prevRotationYaw) * f;
	 * 
	 * double d = (double)f;
	 * 
	 * double d1 = player.prevPosX + (player.posX - player.prevPosX) * d; double d2
	 * = (player.prevPosY + (player.posY - player.prevPosY) * d +
	 * 1.6200000000000001d) - (double)player.getYOffset(); double d3 =
	 * player.prevPosZ + (player.posZ - player.prevPosZ) * d;
	 * 
	 * Vec3d vec1 = new Vec3d(d1, d2, d3);
	 * 
	 * float f11 = MathHelper.cos(-f2 * 0.01745329f - 3.141593f); float f12 =
	 * MathHelper.sin(-f2 * 0.01745329f - 3.141593f); float f13 =
	 * -MathHelper.cos(-f1 * 0.01745329f); float f14 = MathHelper.sin(-f1 *
	 * 0.01745329f);
	 * 
	 * float f15 = f12 * f13; float f16 = f14; float f17 = f11 * f13;
	 * 
	 * double d11 = 5000d;
	 * 
	 * Vec3d vec2 = vec1.addVector((double)f15 * d11, (double)f16 * d11, (double)f17
	 * * d11);
	 */

    //RayTraceResult position = world.rayTraceBlocks(vec1, vec2, false, true, true);


	public LightningBolt(String name, ToolMaterial material) 
	{
		super(material);
	
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
		
		//if (position  != null)
		//{
				if(Minecraft.getMinecraft().gameSettings.keyBindAttack.isKeyDown())
			{
			
			RayTraceResult map = Minecraft.getMinecraft().objectMouseOver;
			
			
			  int x = map.getBlockPos().getX();
			  int y = map.getBlockPos().getY();
			  int z = map.getBlockPos().getZ();
			  
			  world.spawnEntity(new EntityLightningBolt(world, x, y, z, false));
			 
			
			//world.spawnEntity(lightning);
			
			}
		//}
		
	}
	
	

	@Override
	public void registerModels() 
	{
	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	/*public void SummonMinecraftLightningBolt()
	{
		
		
	}*/
	
}
