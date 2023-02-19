package cloud.xzai;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

//作者：Xzai
//介绍：依托答辩

public final class cn2b2t extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("插件已加载");
    }

    @Override
    public void onDisable() {
        getLogger().info("插件已卸载");
    }

    public void consoleLog(String logInfo) {
        CommandSender sender = Bukkit.getConsoleSender();
        sender.sendMessage(logInfo);
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String playerName;
        String info;
        String commandName = command.getName();
        Player player = (Player) sender;
        if (sender.isOp() && commandName.equalsIgnoreCase("test")) {
            playerName = player.getName();
            info = "你好!管理员<" + playerName + ">";
            player.sendMessage(info);
            player.chat("我输入了命令/test,这CN2B2T插件太好用了吧！");
            consoleLog(ChatColor.BLUE + "管理员<" + playerName + ">输入了一条命令:" + commandName);
            consoleLog(ChatColor.BLUE + "服务器发给管理员<" + playerName + ">了一条消息:" + info);
        } else if (commandName.equalsIgnoreCase("info")) {
            playerName = player.getName();
            info = "你好!玩家<" + playerName + ">";
            player.sendMessage(info);
            consoleLog(ChatColor.BLUE + "玩家<" + playerName + ">输入了一条命令:" + commandName);
            consoleLog(ChatColor.BLUE + "服务器发给<" + playerName + ">了一条消息:" + info);
        } else {
            playerName = player.getName();
            info = "玩家<" + playerName + ">执行了一条命令，但是出错了";
            player.sendMessage(info);
            consoleLog(ChatColor.BLUE + "玩家<" + playerName + ">输入了一条命令:" + commandName);
            consoleLog(ChatColor.BLUE + "玩家<" + playerName + ">执行了一条命令，但是出错了");
        }
        return true;
    }
}
