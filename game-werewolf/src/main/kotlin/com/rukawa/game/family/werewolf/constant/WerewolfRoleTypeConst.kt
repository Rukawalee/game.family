package com.rukawa.game.family.werewolf.constant

/**
 * 狼人杀角色类型
 */
enum class WerewolfRoleTypeConst {

    /**
     * 狼
     */
    ROLE_TYPE_WEREWOLF("狼"),

    /**
     * 民
     */
    ROLE_TYPE_CITIZEN("民"),

    /**
     * 神
     */
    ROLE_TYPE_DEITY("神"),

    /**
     * 特殊类型
     */
    ROLE_TYPE_SPECIAL("特殊");

    private var roleIntroduction: String? = null

    constructor(roleIntroduction: String?) {
        this.roleIntroduction = roleIntroduction
    }

}