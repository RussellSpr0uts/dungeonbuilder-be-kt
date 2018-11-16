package com.rsowell.dungeonbuilder.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User(@Id val cognitoId: String,
                val email: String)