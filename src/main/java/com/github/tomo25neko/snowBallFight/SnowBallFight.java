package com.github.tomo25neko.snowBallFight;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariConfig;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

public final class SnowBallFight extends JavaPlugin {

    private static Plugin plugin;

    String jdbcUrl = "jdbc:h2:./plugins/snowball-fight/data/db;MODE=MySQL;AUTO_SERVER=TRUE";
    String username = "sa";   // デフォルトユーザー
    String password = "";     // デフォルトは空パスワード

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

    public static Plugin myInstance() {
        return plugin;
    }

    private void prepareDataFolder() {
        File dataFolder = new File(getDataFolder(), "SnowBall-Fight");
        if (!dataFolder.exists()) {
            if (!dataFolder.mkdirs()) {
                getLogger().warning("データフォルダの作成に失敗しました: " + dataFolder.getAbsolutePath());
            }
        }
    }
}
