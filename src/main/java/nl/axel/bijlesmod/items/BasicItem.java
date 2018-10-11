package nl.axel.bijlesmod.items;

import net.minecraft.item.Item;
import nl.axel.bijlesmod.BijlesMod;

public class BasicItem extends Item {

    protected String name;

    public BasicItem(String name){
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel(){
        BijlesMod.proxy.registerItemRenderer(this, 0, name);
    }

}
