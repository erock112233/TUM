package com.erock112233.TUM.Items;

import com.erock112233.TUM.TUM;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ItemBase extends Item{
	public ItemBase(String name){
		super();
		this.setUnlocalizedName(name);
		this.setTextureName(TUM.MODID + ":" + name);
	}

}
