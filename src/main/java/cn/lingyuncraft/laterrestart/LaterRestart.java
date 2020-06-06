package cn.lingyuncraft.laterrestart;

import cn.lingyuncraft.laterrestart.manage.CommandHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public class LaterRestart extends JavaPlugin{

    public static Plugin plugin;

    public static String broadcastCommand;

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveDefaultConfig();
        broadcastCommand = getConfig().getString("broadcastCommand");
        plugin = Bukkit.getPluginManager().getPlugin("LaterRestart");
        Bukkit.getPluginCommand("LaterRestart").setExecutor(new CommandHandler());
        getLogger().info("插件已启动");
    }
}
