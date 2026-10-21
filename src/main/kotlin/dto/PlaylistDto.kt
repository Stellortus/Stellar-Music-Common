package top.stellortus.stellar_music_common.dto

import kotlinx.serialization.Serializable

@Serializable
data class CreatePlaylistRequest(
    val name: String? = null,
    val description: String? = null,
    val coverPath: String? = null,
    val public: Boolean = false,
)

@Serializable
data class UpdatePlaylistRequest(
    val name: String? = null,
    val description: String? = null,
    val coverPath: String? = null,
    val public: Boolean = false,
)

@Serializable
data class AddTracksRequest(val trackIds: List<Int> = emptyList())

@Serializable
data class AddTracksResponse(val message: String, val added: Int, val ignored: List<Int>)

@Serializable
data class PlaylistDetail(
    val id: Int,
    val ownerId: Int,
    val name: String,
    val description: String?,
    val coverPath: String?,
    val createdAt: Long,
    val updatedAt: Long,
    val tracks: List<Track>,
)


@Suppress("unused")
fun Playlist.toDetailResponse(tracks: List<Track>): PlaylistDetail = PlaylistDetail(
    id = id,
    ownerId = ownerId,
    name = name,
    description = description,
    coverPath = coverPath,
    createdAt = createdAt,
    updatedAt = updatedAt,
    tracks = tracks,
)
