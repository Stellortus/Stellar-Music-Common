package top.stellortus.stellar_music_common.dto

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int = 0,
    val username: String,
    val level: UserLevel = UserLevel.User,
)
