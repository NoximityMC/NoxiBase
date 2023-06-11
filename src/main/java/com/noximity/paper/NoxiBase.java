package com.noximity.paper;

import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.framework.qual.DefaultQualifier;

import java.util.logging.Logger;


@DefaultQualifier(NonNull.class)
public class NoxiBase extends JavaPlugin{

    Logger logger = getLogger();

    @Override
    public void onEnable() {
        logger.info("NoxiBase enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("NoxiBase disabled!");
    }


}