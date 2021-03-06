package io.github.biospace_labs.shoopcraft;


import io.github.biospace_labs.shoopcraft.init.ModBlocks;
import io.github.biospace_labs.shoopcraft.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid=ShoopCraft.MODID, name=ShoopCraft.NAME, version=ShoopCraft.VERSION, acceptedMinecraftVersions = ShoopCraft.ACCEPTED_VERSIONS)
public class ShoopCraft {
    public static final String MODID = "shoopcraft";
    public static final String NAME = "ShoopCraft";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSIONS = "[1.11.2]";

    public static final String CLIENT_PROXY_CLASS = "io.github.biospace_labs.shoopcraft.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "io.github.biospace_labs.shoopcraft.proxy.ServerProxy";

    public static enum ShoopcraftBlocks{
        spooler("spooler", "BlockSpooler");

        private String unlocalisedName;
        private String registryName;

        ShoopcraftBlocks(String unlocalisedName, String registryName){
            this.unlocalisedName = unlocalisedName;
            this.registryName = registryName;
        }

        public String getUnlocalisedName() {
            return unlocalisedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }



    @Mod.Instance
    public static ShoopCraft instance;

    @SidedProxy(serverSide = ShoopCraft.SERVER_PROXY_CLASS, clientSide = ShoopCraft.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("SHOOPCRAFT: PRE-Initializing");
        ModBlocks.init();
        ModBlocks.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("SHOOPCRAFT: Initializing");
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLInitializationEvent event) {
        System.out.println("SHOOPCRAFT: POST-Initializing");
    }
}