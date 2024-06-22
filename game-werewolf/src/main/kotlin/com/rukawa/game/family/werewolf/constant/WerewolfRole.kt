package com.rukawa.game.family.werewolf.constant

enum class WerewolfRole {

    ROLE_WEREWOLF;

    /**
     * 角色名
     */
    var roleName: String? = null

    /**
     * 角色介绍
     */
    var roleIntroduction: String? = null

    /**
     * 角色技能
     */
    var roleSkills: List<String> = ArrayList()

    /**
     * 角色类型
     */
    var roleType: WerewolfRoleType? = null

}