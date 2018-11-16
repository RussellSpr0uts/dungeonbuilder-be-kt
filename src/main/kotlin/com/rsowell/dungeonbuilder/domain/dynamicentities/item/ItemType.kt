package com.rsowell.dungeonbuilder.domain.dynamicentities.item

import com.rsowell.dungeonbuilder.domain.dynamicentities.DynamicEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class ItemType(@Id
                    @GeneratedValue(strategy = GenerationType.AUTO)
                    val id: Long,
                    val name: String)