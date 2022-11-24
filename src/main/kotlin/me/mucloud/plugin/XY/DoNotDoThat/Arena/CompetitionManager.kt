package me.mucloud.plugin.XY.DoNotDoThat.Arena

import org.bukkit.entity.Player
import org.jetbrains.annotations.Nullable
import kotlin.collections.ArrayList

object CompetitionManager {

    private var list: MutableList<Competition> = ArrayList()

    @Nullable fun getCompetition(p: Player): Competition?{

        for(i in list){
            if(i.getPlayers().contains(p)){
                return i
            }
        }

        return null
    }

    fun getCompetitions(): List<Competition>{
        return list
    }

}