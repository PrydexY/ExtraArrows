package tronmc.fun.extraarrows2.handlers;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import tronmc.fun.extraarrows2.ExtraArrows2;

public class ArrowHandler implements Listener{
    public ArrowHandler(ExtraArrows2 plugin)
    {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onArrowCrash(ProjectileHitEvent event)
    {
        Entity entity = event.getEntity();
        Bukkit.getLogger().info(entity.getName());
        if ((entity.getName()).equals("1")) {
            World w = entity.getWorld(); //if the event has a player object use that to get the world
            w.createExplosion(entity.getLocation().x(), entity.getLocation().y(), entity.getLocation().z(), 3);
            entity.remove();
        }
    }
}
