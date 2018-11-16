package com.rsowell.dungeonbuilder.domain

import com.rsowell.dungeonbuilder.domain.tile.TileSet
import javax.persistence.*

@Entity
data class Dungeon (@Id
                    @GeneratedValue(strategy = GenerationType.AUTO)
                    val id: Long,
                    val user: User,
                    val name: String,
                    val tileSet: TileSet,
                    val tiles: String,
                    val dynamicEntities: String) {

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id")
    lateinit var dungeonType: DungeonType
}