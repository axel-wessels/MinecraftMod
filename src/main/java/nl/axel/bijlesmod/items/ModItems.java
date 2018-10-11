package nl.axel.bijlesmod.items;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import nl.axel.bijlesmod.util.Names;
import nl.axel.bijlesmod.util.Reference;

public final class ModItems {

    //Items
    public static final BasicItem itemTest = new BasicItem(Names.Items.TEST_ITEM);

    public static void register(IForgeRegistry<Item> registry){
        registry.registerAll(
                itemTest
        );
    }

    public static void registerModels(){
        itemTest.registerItemModel();
    }
}
