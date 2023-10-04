package com.sysnote8.lockdifficulty.event;

import com.sysnote8.lockdifficulty.util.Configs;
import com.sysnote8.lockdifficulty.util.MyLog;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class WorldLoadEvent {
    public WorldLoadEvent() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load e) {
        World world = e.getWorld();
        if (!world.isRemote) {
            WorldInfo worldInfo = world.getWorldInfo();
            boolean isAlreadyLocked = worldInfo.isDifficultyLocked();
            if(!isAlreadyLocked || Configs.forceDifficulty) {
                EnumDifficulty configDifficulty = EnumDifficulty.NORMAL;
                if(1<=Configs.difficulty && Configs.difficulty<=4) {
                    configDifficulty = EnumDifficulty.byId(Configs.difficulty-1);
                }
                worldInfo.setDifficulty(configDifficulty);
                if(Configs.isLock && !isAlreadyLocked) {
                    worldInfo.setDifficultyLocked(true);
                }
            }
        }
    }
}
