package com.rsowell.dungeonbuilder.domain.dynamicentities.enemy

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class EnemyType(@Id
                     @GeneratedValue(strategy = GenerationType.AUTO)
                     val id: Long,
                     val name: String)