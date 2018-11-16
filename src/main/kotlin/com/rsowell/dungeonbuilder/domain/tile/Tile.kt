package com.rsowell.dungeonbuilder.domain.tile

import javax.persistence.*

@Entity
class Tile (@Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            val id: Long) {

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id")
    lateinit var TileType: TileType

}