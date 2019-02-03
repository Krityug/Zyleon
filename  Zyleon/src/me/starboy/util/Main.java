package me.starboy.util;

import me.starboy.util.me.starboy.util.Commands.Island;
import me.starboy.util.me.starboy.util.Commands.OwnerCryptoCurrency;
import me.starboy.util.me.starboy.util.Commands.PanelCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Zyleon Plugin is enabled on SpigotMC Engine");
        this.getCommand("starterkit").setExecutor(new TestCommand());
        this.getCommand("ultra").setExecutor(new UltraKit());
        this.getCommand("beta").setExecutor(new BETA());
        this.getCommand("iamhungry").setExecutor(new Void());
        this.getCommand("island").setExecutor(new Island());
        this.getCommand("panel").setExecutor(new PanelCommand());
        this.getCommand("encrypt").setExecutor(new OwnerCryptoCurrency());
    }

    @Override
    public void onDisable() {
        getLogger().info("Zyleon Plugin is now disabled on SpigotMC Engine");
    }
}

