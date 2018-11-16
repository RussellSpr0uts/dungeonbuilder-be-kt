package com.rsowell.dungeonbuilder.domain.dynamicentities.playercharacter

import com.rsowell.dungeonbuilder.domain.dynamicentities.DynamicEntity
import javax.persistence.*

@Entity
data class PlayerCharacterType(@Id
                               @GeneratedValue(strategy = GenerationType.AUTO)
                               val id: Long,
                               val name: String)