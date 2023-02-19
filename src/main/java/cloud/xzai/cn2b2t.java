package cloud.xzai;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class cn2b2t extends JavaPlugin {

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("hello")) {
            Player player = (Player) sender;
            player
                .sendMessage("你好！这是一个测试插件，你的id是："
                             + player.getName() + "\n生命值是："
                               + player.getHealth() + "\n等级是：" + player.getLevel());
            return true;
        }
        return false;
    }

}
