package com.sysnote8.lockdifficulty;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.sysnote8.lockdifficulty.Tags;

@Mod(modid = Tags.modid, version = Tags.version, name = Tags.modname, acceptedMinecraftVersions = "[1.12.2]")
public class MainMod {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
