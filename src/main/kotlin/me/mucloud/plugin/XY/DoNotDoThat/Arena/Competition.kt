package me.mucloud.plugin.XY.DoNotDoThat.Arena

import org.bukkit.entity.Player
import java.util.Collections

class Competition(

    private var arena: Arena,
    private var waitingRoom: WaitingRoom

): ICompetition
{

    fun stop(){


    }

    fun getPlayers(): List<Player>{



        return Collections.emptyList()
    }

}