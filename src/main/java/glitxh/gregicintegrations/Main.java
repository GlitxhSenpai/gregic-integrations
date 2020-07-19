package glitxh.gregicintegrations;

import glitxh.gregicintegrations.proxy.CommonProxy;
import glitxh.gregicintegrations.util.gregicintegrations;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import gregtech.api.*;

@Mod(modid = gregicintegrations.MODID, name = gregicintegrations.NAME, version = gregicintegrations.VERSION)
public class Main
{
    @Instance
    public static Main instance;

    @SidedProxy(clientSide = gregicintegrations.CLIENT, serverSide = gregicintegrations.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }
}
