package com.rsowell.dungeonbuilder.domain.dynamicentities

interface DynamicEntity {
    val id: Long
    val name: String
    val startPosX: Double
    val startPoxY: Double
}