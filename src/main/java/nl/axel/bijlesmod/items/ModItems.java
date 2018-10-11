package nl.axel.bijlesmod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import nl.axel.bijlesmod.util.Names;
import nl.axel.bijlesmod.util.Reference;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public final class ModItems {

    //Items
    public static final Item itemTest = new BasicItem(Names.Items.TEST_ITEM);
}
