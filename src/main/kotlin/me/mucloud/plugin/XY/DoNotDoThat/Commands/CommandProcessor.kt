package me.mucloud.plugin.XY.DoNotDoThat.Commands

import me.mucloud.plugin.XY.DoNotDoThat.Main
import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.ConsoleCommandSender

class CommandProcessor(

    private var main: Main

): CommandExecutor{

    fun sendInfo(sender: CommandSender){
//        sender.sendMessage("${ChatColor.GRAY}${ChatColor.BOLD}| ${main.PREFIX}  ${ChatColor.RED}${ChatColor.BOLD}Ver ${main.Version}")
//        sender.sendMessage("${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.AQUA}${ChatColor.BOLD}作者: ${ChatColor.GRAY}${ChatColor.BOLD}Mu_Cloud")
//        sender.sendMessage("${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.AQUA}${ChatColor.BOLD}BUG 提交站: ${ChatColor.YELLOW}${ChatColor.BOLD} https://github.com/MuCloudOfficial/XY-DoNotDoThat")
//        sender.sendMessage("${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GRAY}${ChatColor.BOLD}------------------------------------------------------------------")
//        sender.sendMessage("${ChatColor.GRAY}${ChatColor.BOLD}| ")
//        sender.sendMessage("${ChatColor.GRAY}${ChatColor.BOLD}| ")
//        sender.sendMessage("${ChatColor.GRAY}${ChatColor.BOLD}| ")
//        sender.sendMessage("${ChatColor.GRAY}${ChatColor.BOLD}| ")
//        sender.sendMessage("${ChatColor.GRAY}${ChatColor.BOLD}| ")
//        sender.sendMessage("${ChatColor.GRAY}${ChatColor.BOLD}| ")
//        sender.sendMessage("${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GRAY}${ChatColor.BOLD}------------------------------------------------------------------")

        sender.sendMessage("""
            
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${main.PREFIX}  ${ChatColor.RED}${ChatColor.BOLD}Ver ${main.Version}
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.AQUA}${ChatColor.BOLD}作者: ${ChatColor.GRAY}${ChatColor.BOLD}Mu_Cloud
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.AQUA}${ChatColor.BOLD}BUG 提交站: ${ChatColor.YELLOW}${ChatColor.BOLD} https://github.com/MuCloudOfficial/XY-DoNotDoThat
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GRAY}${ChatColor.BOLD}------------------------------------------------------------------
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.RED}${ChatColor.BOLD}[] 为必填参数 | () 为可选参数
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GRAY}${ChatColor.BOLD}------------------------------------------------------------------
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GREEN}/info
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GOLD}${ChatColor.BOLD}显示帮助文档
            ${ChatColor.GRAY}${ChatColor.BOLD}| 
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GREEN}/xydndt showGames
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GOLD}${ChatColor.BOLD}显示当前处于正在等待和正在进行的游戏
            ${ChatColor.GRAY}${ChatColor.BOLD}| 
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GREEN}/xydndt forcestart (房间号)
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GOLD}${ChatColor.BOLD}强制进行正在等待状态的游戏，房间号可在 /xydndt showGames 指令中获取
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.RED}${ChatColor.BOLD}注意！当你处于任意对局中使用该指令会直接开始当局游戏! 该指令对正在进行的游戏无效！
            ${ChatColor.GRAY}${ChatColor.BOLD}| 
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GREEN}/xydndt forcestop (房间号)
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GOLD}${ChatColor.BOLD}强制结束正在进行状态的游戏，房间号可在 /xydndt showGames 指令中获取
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.RED}${ChatColor.BOLD}注意！当你处于任意对局中使用该指令会直接取消当局游戏! 该指令仅正在进行的游戏有效！
            ${ChatColor.GRAY}${ChatColor.BOLD}| 
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GREEN}/xydndt selectWaitingArea
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GOLD}${ChatColor.BOLD}设置等待区，以左右手划定区域，该区域会作为等待区
            ${ChatColor.GRAY}${ChatColor.BOLD}| 
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GREEN}
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GOLD}${ChatColor.BOLD}
            ${ChatColor.GRAY}${ChatColor.BOLD}| 
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GREEN}
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GOLD}${ChatColor.BOLD}
            ${ChatColor.GRAY}${ChatColor.BOLD}| 
            ${ChatColor.GRAY}${ChatColor.BOLD}| ${ChatColor.GRAY}${ChatColor.BOLD}------------------------------------------------------------------
            
        """.trimIndent())
    }

    override fun onCommand(sender: CommandSender, cmd: Command, s: String, ss: Array<out String>): Boolean {

        if(sender is ConsoleCommandSender){

        }

        if(cmd.name.equals("XYDNDT",true)){

        }

        return false;
    }

}