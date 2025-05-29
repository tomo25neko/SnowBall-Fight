package com.github.tomo25neko.snowBallFight;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class SnowBallFight extends JavaPlugin {
    private static Plugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;


        getLogger().info("SnowBall-Fightが起動しました!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("SnowBall-Fightが停止しました!");
    }

    public static Plugin MyInstance() {
        return plugin;
    }
}
