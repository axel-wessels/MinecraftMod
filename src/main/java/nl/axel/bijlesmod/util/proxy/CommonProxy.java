package nl.axel.bijlesmod.util.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import nl.axel.bijlesmod.util.Reference;

public class CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + id, "inventory"));
    }
}
