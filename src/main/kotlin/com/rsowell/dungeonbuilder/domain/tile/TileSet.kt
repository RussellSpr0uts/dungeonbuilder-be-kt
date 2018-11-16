package com.rsowell.dungeonbuilder.domain.tile

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class TileSet (@Id
                    @GeneratedValue(strategy = GenerationType.AUTO)
                    val id: Long)