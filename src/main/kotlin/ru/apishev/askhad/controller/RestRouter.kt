package ru.apishev.askhad.controller

import com.google.gson.Gson
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.apishev.askhad.events
import ru.apishev.askhad.model.Event
import ru.apishev.askhad.model.Player
import ru.apishev.askhad.model.Team
import ru.apishev.askhad.players
import ru.apishev.askhad.teams

@RestController("/")
class RestRouter {
    @GetMapping("teams")
    fun getTeams() = Gson().fromJson(teams, Array<Team>::class.java)

    @GetMapping("events")
    fun getEvents() = Gson().fromJson(events, Array<Event>::class.java)

    @GetMapping("players")
    fun getPlayers() = Gson().fromJson(players, Array<Player>::class.java)

}
