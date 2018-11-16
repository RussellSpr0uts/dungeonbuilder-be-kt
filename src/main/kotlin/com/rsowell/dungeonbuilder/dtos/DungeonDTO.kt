package com.rsowell.dungeonbuilder.dtos

import com.rsowell.dungeonbuilder.domain.dynamicentities.DynamicEntity
import com.rsowell.dungeonbuilder.domain.tile.Tile
import com.rsowell.dungeonbuilder.domain.tile.TileSet
import org.apache.catalina.User

data class DungeonDTO (val name: String,
                       val user: User,
                       val tileSet: TileSet,
                       val tiles: MutableList<Tile>,
                       val dynamicEntites: MutableList<DynamicEntity>)