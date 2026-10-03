package top.stellortus.stellar_music_common.dto

import kotlinx.serialization.Serializable

@Serializable
data class RegisterRequest(val username: String, val password: String)

@Serializable
data class LoginRequest(val username: String, val password: String)

@Serializable
data class AuthResponse(val token: String, val user: User)

@Serializable
data class MessageResponse(val message: String)

