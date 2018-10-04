package nl.axel.bijlesmod;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nl.axel.bijlesmod.util.Reference;
import nl.axel.bijlesmod.util.proxy.IProxy;
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
    public static IProxy proxy;

    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        //handles pre initialization
        BijlesMod.LOGGER.info("Bijlesmod PreInitialisatie compleet!");

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