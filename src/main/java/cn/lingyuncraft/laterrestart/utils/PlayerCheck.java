package cn.lingyuncraft.laterrestart.utils;

import org.bukkit.Bukkit;

import java.util.stream.Stream;

public class PlayerCheck {

    public static int getOnlinePlayerNumber() {
        return (int) Stream.of(Bukkit.getOnlinePlayers()).count();
    }
}
