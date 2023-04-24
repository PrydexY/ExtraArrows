package tronmc.fun.extraarrows2.handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import tronmc.fun.extraarrows2.ExtraArrows2;


public class BowHandler implements Listener {
    public BowHandler(ExtraArrows2 plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    void OnBowShot(EntityShootBowEvent event)
    {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            ItemStack arrowStack = null;
            for (ItemStack item : player.getInventory().getContents()) {
                if (item != null && item.getType() == Material.ARROW) {
                    arrowStack = item;
                    break;
                }
            }

            @NotNull Arrow arrow = (Arrow) event.getProjectile();
            assert arrowStack != null;
            ItemMeta meta = arrowStack.getItemMeta();
            arrow.setCustomName(String.valueOf(meta.getCustomModelData()));
            event.setProjectile(arrow);
        }


    }
}
