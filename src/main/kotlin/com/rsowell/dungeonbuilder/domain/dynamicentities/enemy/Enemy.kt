package com.rsowell.dungeonbuilder.domain.dynamicentities.enemy

import com.rsowell.dungeonbuilder.domain.dynamicentities.DynamicEntity
import javax.persistence.*

@Entity
data class Enemy(@Id
                 @GeneratedValue(strategy = GenerationType.AUTO)
                 override val id: Long,
                 override val name: String,
                 override val startPosX: Double,
                 override val startPoxY: Double) : DynamicEntity {

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id")
    lateinit var enemyType: EnemyType
}