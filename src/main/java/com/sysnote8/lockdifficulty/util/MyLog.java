package com.sysnote8.lockdifficulty.util;

import com.sysnote8.lockdifficulty.Tags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLog {
    private static final Logger ModLogger = LogManager.getLogger(Tags.modid);
    public static void info(String str) {
        ModLogger.info(str);
    }
    public static void error(String str) {
        ModLogger.error(str);
    }
    public static void warn(String str) {
        ModLogger.warn(str);
    }
}
