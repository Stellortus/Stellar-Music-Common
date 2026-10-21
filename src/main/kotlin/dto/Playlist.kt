package top.stellortus.stellar_music_common.dto

import kotlinx.serialization.Serializable

@Serializable
data class Playlist(
    val id: Int = 0,
    val ownerId: Int,
    val name: String,
    val description: String? = null,
    val coverPath: String? = null,
    val public: Boolean = false,
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis(),
    val trackCount: Int,
)
