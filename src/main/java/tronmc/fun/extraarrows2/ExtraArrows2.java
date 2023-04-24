package tronmc.fun.extraarrows2;

import org.bukkit.plugin.java.JavaPlugin;
import tronmc.fun.extraarrows2.handlers.ArrowHandler;
import tronmc.fun.extraarrows2.handlers.BowHandler;

import java.util.Objects;

public final class ExtraArrows2 extends JavaPlugin {
    static public ItemManager items;
    @Override
    public void onEnable() {
        new ArrowHandler(this);
        new BowHandler(this);
        items = new ItemManager();
    }

    @Override
    public void onDisable() {

    }
}
