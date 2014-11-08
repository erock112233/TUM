package com.erock112233.TUM.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class creativeTabs {
	public static CreativeTabs tabTUMItems;
	
	public void init(){
		tabTUMItems = new TUMCreativeTab("tabTumItems"){
			@Override
			public Item getTabIconItem(){
				return Items.carrot;
			}
		};
	}
	private static abstract class TUMCreativeTab extends CreativeTabs{
		public TUMCreativeTab(String label){
			super(label);
		}
//		@SuppressWarnings({"rawtypes", "unchecked"})
//		@Override
//		public void displayAllReleventItems(List l){
//			super.displayAllReleventItems(l);
//			for(String s : PartRegistery.getRegisteredPartsForTab(this))
//				l.add(PartRegistry.getItemFromPart(s));
//		}
	}

}
