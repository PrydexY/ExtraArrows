package tronmc.fun.extraarrows2;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager {
    public static ItemStack TNTArrow;
    public ItemManager()
    {
        createTNTArrow();
    }
    private static void createTNTArrow()
    {
        ItemStack item = new ItemStack(Material.ARROW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cПороховая стрела");
        meta.setCustomModelData(1);
        item.setItemMeta(meta);
        TNTArrow = item;
        ShapelessRecipe recipe = new ShapelessRecipe(NamespacedKey.minecraft("tntarrow_shapless"), item);
        recipe.addIngredient(1,Material.GUNPOWDER);
        recipe.addIngredient(4, Material.ARROW);
        Bukkit.getServer().removeRecipe(NamespacedKey.minecraft("tntarrow_shapless"));
        Bukkit.getServer().addRecipe(recipe);

    }
}
