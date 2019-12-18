package ru.apishev.askhad.model

import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Player(

        @field:SerializedName("hieght")
        val hieght: Int? = null,

        @field:SerializedName("firstName")
        val firstName: String? = null,

        @field:SerializedName("lastName")
        val lastName: String? = null,

        @field:SerializedName("number")
        val number: Int? = null,

        @field:SerializedName("teamId")
        val teamId: String? = null,

        @field:SerializedName("weight")
        val weight: Int? = null,

        @field:SerializedName("dateOfBirth")
        val dateOfBirth: String? = null,

        @field:SerializedName("position")
        val position: String? = null,

        @field:SerializedName("title")
        val title: String? = null,

        @field:SerializedName("playerId")
        val playerId: String? = null
)