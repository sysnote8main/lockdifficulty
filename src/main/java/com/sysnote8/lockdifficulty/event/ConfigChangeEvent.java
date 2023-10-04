package com.sysnote8.lockdifficulty.event;

import com.sysnote8.lockdifficulty.Tags;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Tags.modid)
public class ConfigChangeEvent {
    @SubscribeEvent
    public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent e) {
        if(e.getModID().equals(Tags.modid)) {
            ConfigManager.sync(Tags.modid, Config.Type.INSTANCE);
        }
    }
}
