package me.thephasecat.join_leave_smp_messages;

import org.bukkit.plugin.java.JavaPlugin;

public final class Join_leave_smp_messages extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);

    }
}
