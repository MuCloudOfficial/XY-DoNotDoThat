package me.mucloud.plugin.XY.DoNotDoThat.Arena

import org.bukkit.entity.Player

interface IArena {

    fun forceStop()

    fun getPlayer(): List<Player>

    fun getTeams(): List<TeamColor>

    fun refreshCell()

}