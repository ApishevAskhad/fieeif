package ru.apishev.askhad.model

import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Team(

        @field:SerializedName("players")
        val players: List<String?>? = null,

        @field:SerializedName("teamId")
        val teamId: String? = null,

        @field:SerializedName("name")
        val name: String? = null,

        @field:SerializedName("picture")
        val picture: String? = null
)