package top.stellortus.stellar_music_common.dto

import kotlinx.serialization.Serializable

@Serializable
data class AdminMetaResponse(
    val me: User,
    val minLevel: Int,
    val allLevels: List<LevelOption>,
    val assignableLevels: List<Int>,
)

@Serializable
data class LevelOption(val value: Int, val name: String)

@Serializable
data class TrackListResponse(val items: List<Track>, val total: Int)

@Serializable
data class UserListResponse(val items: List<User>, val total: Int)

@Serializable
data class PlaylistListResponse(val items: List<PlaylistResponse>, val total: Int)

@Serializable
data class UpdateTrackRequest(
    val title: String? = null,
    val artists: List<String>? = null,
    val coverPath: String? = null,
    val lyricsPath: String? = null,
)

@Serializable
data class UpdateUserLevelRequest(val level: Int)
