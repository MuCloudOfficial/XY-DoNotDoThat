package me.mucloud.plugin.XY.DoNotDoThat.Arena

import org.bukkit.*
import java.util.Random

object ArenaGenerator {

    fun generateArena(mode: GameMode, teamCount: Int, world: World){
        var w: World? = WorldCreator("MKDNDTA").environment(World.Environment.NORMAL).type(WorldType.NORMAL).createWorld()

        w?.difficulty = Difficulty.HARD
        w?.pvp = true
        w?.setGameRule(GameRule.DO_WEATHER_CYCLE,false)

        w?.getChunkAt(Random().nextInt(),Random().nextInt())


    }

}