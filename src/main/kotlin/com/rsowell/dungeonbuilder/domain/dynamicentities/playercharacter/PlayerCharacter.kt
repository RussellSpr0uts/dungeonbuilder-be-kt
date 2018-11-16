package com.rsowell.dungeonbuilder.domain.dynamicentities.playercharacter

import com.rsowell.dungeonbuilder.domain.dynamicentities.DynamicEntity
import javax.persistence.*
import javax.persistence.JoinColumn
import javax.persistence.FetchType



@Entity
data class PlayerCharacter(@Id
                           @GeneratedValue(strategy = GenerationType.AUTO)
                           override val id: Long,
                           override val name: String,
                           override val startPosX: Double,
                           override val startPoxY: Double) : DynamicEntity {

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id")
    lateinit var playerCharacterType: PlayerCharacterType

}