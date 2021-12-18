package it.riccardomurachelli.mc.AntiMapDestroy;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().fine("AntiMapDestroy abilitato! | © ParliamoDiPC 2021");
        this.getCommand("editmap").setExecutor(new Command());
        getServer().getPluginManager().registerEvents(new PluginListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("AntiMapDestroy disabilitato!");
    }
}
