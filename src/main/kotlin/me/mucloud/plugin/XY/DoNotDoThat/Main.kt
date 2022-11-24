package me.mucloud.plugin.XY.DoNotDoThat

import org.bukkit.plugin.java.JavaPlugin
import org.yaml.snakeyaml.Yaml

class Main : JavaPlugin() {

    var PREFIX = "§4§lXY§7§l-§6§lDoNotDoThat"
    lateinit var Version: String

    override fun onEnable() {

        server.consoleSender.sendMessage("§7§l[$PREFIX§7§l] §a§l插件已启动")
    }

    override fun onDisable() {

        server.consoleSender.sendMessage("§7§l[$PREFIX§7§l] §a§l插件已关闭")
    }

    fun fetchVersion(){
        val y = Yaml()
        val map = y.loadAs(getResource("plugin.yml"), HashMap<String, String>().javaClass)

        Version = map?.get("version") ?: "NULL"
    }

}