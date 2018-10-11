package nl.axel.bijlesmod;


import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nl.axel.bijlesmod.items.ModItems;
import nl.axel.bijlesmod.util.Reference;
import nl.axel.bijlesmod.util.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID , name = Reference.MOD_NAME , version = Reference.VERSION/* name version guiFactory*/)


/*
GUI Betekent:
    G: Graphic(al)
    U: User
    I: Interface
*/

public class BijlesMod {

    @Instance("Bijlesmod")
    public static BijlesMod instance;

    @SidedProxy(clientSide = Reference.CLASS_PROXY_CLIENT, serverSide = Reference.CLASS_PROXY_SERVER)
    public static CommonProxy proxy;

    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        //handles pre initialization
        BijlesMod.LOGGER.info("Bijlesmod PreInitialisatie compleet!");

    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler{
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
            ModItems.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event){
            ModItems.registerModels();
        }
    }

    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event){

        //handles pre initialization
        BijlesMod.LOGGER.info("Bijlesmod Initialisatie compleet!");

    }

    @Mod.EventHandler
    public void preInit(FMLPostInitializationEvent event){

        //handles pre initialization
        BijlesMod.LOGGER.info("Bijlesmod PostInitialisatie compleet!");

    }

    //beginnings
}