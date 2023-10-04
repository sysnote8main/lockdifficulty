package com.sysnote8.lockdifficulty.util;

import com.sysnote8.lockdifficulty.Tags;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Config(modid = Tags.modid)
@LangKey("Lock Difficulty's Config")
public class Configs {
        @Comment("Difficulty (1:peaceful, 2:easy, 3:normal (default), 4:hard)")
        @RangeInt(min = 1, max = 4)
        public static int difficulty = 3;
        @Comment("Lock a difficulty when this mod sets it.")
        public static boolean isLock = true;
        @Comment("Change difficulty when already difficulty was locked.")
        public static boolean forceDifficulty = false;
}
