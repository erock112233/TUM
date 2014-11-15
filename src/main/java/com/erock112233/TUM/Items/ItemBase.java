package com.erock112233.TUM.Items;

import com.erock112233.TUM.TUM;
import com.erock112233.TUM.init.creativeTabs;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ItemBase extends Item{
	public ItemBase(String name){
		super();
		this.setUnlocalizedName(name);
		this.setCreativeTab(creativeTabs.tabTUMItems);
		this.setTextureName(TUM.MODID + ":" + name);
	}

}
