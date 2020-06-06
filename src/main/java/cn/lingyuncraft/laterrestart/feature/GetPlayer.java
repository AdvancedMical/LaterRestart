package cn.lingyuncraft.laterrestart.feature;

import cn.lingyuncraft.laterrestart.LaterRestart;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import static cn.lingyuncraft.laterrestart.utils.PlayerCheck.getOnlinePlayerNumber;


public class GetPlayer {
    public static void getStart(int i) {
        new BukkitRunnable() {
            @Override
            public void run() {
                if (i >= getOnlinePlayerNumber()) {
                    Bukkit.shutdown();
                }
            }
        }.runTaskTimer(LaterRestart.plugin, 20L, 20L);
    }
}
