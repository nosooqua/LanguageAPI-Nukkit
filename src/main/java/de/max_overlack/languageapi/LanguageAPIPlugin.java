package de.max_overlack.languageapi;

import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;

import java.util.HashMap;
import java.util.Map;

public final class LanguageAPIPlugin extends PluginBase {

    private static LanguageAPIPlugin instance;
    private final Map<String, RegisteredPlugin> registeredPlugins;

    public static LanguageAPIPlugin getInstance() {
        return instance;
    }

    public LanguageAPIPlugin() {
        instance = this;
        this.registeredPlugins = new HashMap<>();
    }

    public Map<String, RegisteredPlugin> getRegisteredPlugins() {
        return this.registeredPlugins;
    }

    @Override
    public void onEnable() {
        this.getDataFolder().mkdir();
    }

}