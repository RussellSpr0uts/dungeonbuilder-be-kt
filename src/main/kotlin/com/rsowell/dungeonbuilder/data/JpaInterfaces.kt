package com.rsowell.dungeonbuilder.data

import com.rsowell.dungeonbuilder.domain.Dungeon
import com.rsowell.dungeonbuilder.domain.DungeonType
import com.rsowell.dungeonbuilder.domain.User
import com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.Enemy
import com.rsowell.dungeonbuilder.domain.dynamicentities.enemy.EnemyType
import com.rsowell.dungeonbuilder.domain.dynamicentities.item.Item
import com.rsowell.dungeonbuilder.domain.dynamicentities.item.ItemType
import com.rsowell.dungeonbuilder.domain.dynamicentities.playercharacter.PlayerCharacter
import com.rsowell.dungeonbuilder.domain.dynamicentities.playercharacter.PlayerCharacterType
import com.rsowell.dungeonbuilder.domain.tile.Tile
import com.rsowell.dungeonbuilder.domain.tile.TileSet
import com.rsowell.dungeonbuilder.domain.tile.TileType
import org.springframework.data.jpa.repository.JpaRepository

interface DungeonRepository: JpaRepository<Dungeon, Long>
interface DungeonTypeRepository: JpaRepository<DungeonType, Long>
interface UserRepository: JpaRepository<User, Long>
interface TileSetRepository: JpaRepository<TileSet, Long>
interface TileTypeRepository: JpaRepository<TileType, Long>
interface TileRepository: JpaRepository<Tile, Long>
interface PlayerCharacterRepository: JpaRepository<PlayerCharacter, Long>
interface PlayerCharacterTypeRepository: JpaRepository<PlayerCharacterType, Long>
interface ItemRepository: JpaRepository<Item, Long>
interface ItemTypeRepository : JpaRepository<ItemType, Long>
interface EnemyRepository: JpaRepository<Enemy, Long>
interface EnemyTypeRepository: JpaRepository<EnemyType, Long>
