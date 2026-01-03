package me.CHANGEME.slimefunaddon;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class ExampleAddon extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            MiniMessage mm = MiniMessage.miniMessage(); // Direct MiniMessage parsing into a Component 
            Component message = mm.deserialize( "<red>A</red><gold>p</gold><yellow>p</yellow><green>r</green><aqua>o</aqua><blue>x</blue><light_purple>i</light_purple>" + "<#aa55ff>m</#aa55ff><#ff5580>a</#ff5580><#ffcc55>s</#ffcc55><#55ffaa>t</#55ffaa><#55aaff>e</#55aaff><#aa55ff>r</#aa55ff> " + "<gradient:#55ffff:#5555ff>Studios 2004</gradient>" ); 
            // Example: send to console or player 
            System.out.println(message);
            System.out.println("on 2025.12.23, we decided to not work on version that is new than 1.21.11. only 1.21.11 is supported. please use ViaVersion to allow 1.21.11+ from joining!");
            System.out.println("For More Information, Please see https://netgames.approximasterstudios2004.ddnsgeek.com/v26andabove.html for more info.");
            System.out.println("2025년 12월 23일부로 저희 플러그인은 1.21.11만 지원합니다. 1.21.11보다 높은 버전은 지원하지 않습니다. 26.1 버전도 접속시키려면 ViaVersion을 사용해야 합니다!");
            System.out.println("자세한 정보가 필요하시면 https://netgames.approximasterstudios2004.ddnsgeek.com/v26andabove.html을 확인하십시오.");
        }

        /*
         * 1. Creating a new Category
         * This Category will use the following ItemStack
         */
        ItemStack itemGroupItem = new CustomItemStack(Material.DIAMOND, "&4Funpro&6ximast&eer Category", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey itemGroupId = new NamespacedKey(this, "addon_category");
        ItemGroup itemGroup = new ItemGroup(itemGroupId, itemGroupItem);

        /*
         * 2. Create a new SlimefunItemStack
         * This class has many constructors, it is very important
         * that you give each item a unique id.
         */
        SlimefunItemStack slimefunItem = new SlimefunItemStack("COOL_DIAMOND", Material.DIAMOND, "&5Cool Diamond", "&c+20% Coolness");

        /*
         * 3. Creating a Recipe
         * The Recipe is an ItemStack Array with a length of 9.
         * It represents a Shaped Recipe in a 3x3 crafting grid.
         * The machine in which this recipe is crafted in is specified
         * further down as the RecipeType.
         */
        ItemStack[] recipe = { new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.DIAMOND), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD) };

        /*
         * 4. Registering the Item
         * Now you just have to register the item.
         * RecipeType.ENHANCED_CRAFTING_TABLE refers to the machine in
         * which this item is crafted in.
         * Recipe Types from Slimefun itself will automatically add the recipe to that machine.
         */
        SlimefunItem item = new SlimefunItem(itemGroup, slimefunItem, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        item.register(this);
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }

}
