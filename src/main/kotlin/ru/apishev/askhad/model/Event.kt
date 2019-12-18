package ru.apishev.askhad.model

import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Event(

        @field:SerializedName("homeScore")
        val homeScore: Int? = null,

        @field:SerializedName("guestScore")
        val guestScore: Int? = null,

        @field:SerializedName("endDate")
        val endDate: String? = null,

        @field:SerializedName("homeTeam")
        val homeTeam: String? = null,

        @field:SerializedName("guestTeam")
        val guestTeam: String? = null,

        @field:SerializedName("startdDate")
        val startdDate: String? = null
)