package com.rsowell.dungeonbuilder.domain

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class DungeonType(@Id
                       @GeneratedValue(strategy = GenerationType.AUTO)
                       val id: Long,
                       val name: String)