package top.stellortus.stellar_music_common.dto

import kotlin.enums.enumEntries

enum class UserLevel(val value: Int) {
    User(0),
    VIP(1),
    Admin(5),
    Owner(9);

    companion object {
        fun fromValue(value: Int): UserLevel =
            enumEntries<UserLevel>().firstOrNull { it.value == value } ?: User

        fun canModify(actor: UserLevel, target: UserLevel): Boolean =
            target.value < actor.value

        fun canAssign(actor: UserLevel, newLevel: UserLevel): Boolean =
            newLevel.value < actor.value

        fun assignableBelow(actor: UserLevel): List<UserLevel> =
            enumEntries<UserLevel>().filter { it.value < actor.value }.sortedByDescending { it.value }
    }
}
