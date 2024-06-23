package com.rukawa.game.family.werewolf.constant

enum class WerewolfRole {

    /**
     * 村民
     */
    ROLE_VILLAGER("村民", "没有技能，黑夜闭眼玩家。", null, WerewolfRoleType.ROLE_TYPE_CITIZEN),

    /**
     * 狼人
     */
    ROLE_WEREWOLF("狼人", "每晚里可以击杀一名玩家。", listOf(WerewolfSkill.SKILL_NIGHT_KILL, WerewolfSkill.SKILL_DAYTIME_SELF_EXPLOSION), WerewolfRoleType.ROLE_TYPE_WEREWOLF),

    /**
     * 狼王
     */
    ROLE_WEREWOLF_KING("狼王", "出局（非殉情、毒杀）后可以开枪击杀一名玩家。", listOf(WerewolfSkill.SKILL_NIGHT_KILL, WerewolfSkill.SKILL_DAYTIME_SELF_EXPLOSION, WerewolfSkill.SKILL_SHOOT), WerewolfRoleType.ROLE_TYPE_WEREWOLF),

    /**
     * 女巫
     */
    ROLE_WITCH("女巫", "有两瓶药，解药可以解救一名玩家，毒药可以毒杀一名玩家，每晚只能用一瓶药。", listOf(WerewolfSkill.SKILL_NIGHT_POISON, WerewolfSkill.SKILL_NIGHT_RESCUE), WerewolfRoleType.ROLE_TYPE_DEITY),

    /**
     * 预言家
     */
    ROLE_PROPHET("预言家", "每晚可以查看一名玩家身份。", listOf(WerewolfSkill.SKILL_NIGHT_PREDICT), WerewolfRoleType.ROLE_TYPE_DEITY),

    /**
     * 守卫
     */
    ROLE_GUARD("守卫", "每晚可以守护一名玩家不出局，不能连续两晚守护同一名玩家。", listOf(WerewolfSkill.SKILL_NIGHT_PROTECT), WerewolfRoleType.ROLE_TYPE_DEITY),

    /**
     * 猎人
     */
    ROLE_HUNTER("猎人", "出局（狼杀、票杀）后可以开枪击杀一名玩家。", listOf(WerewolfSkill.SKILL_SHOOT), WerewolfRoleType.ROLE_TYPE_DEITY),

    ;

    /**
     * 角色名
     */
    private var roleName: String? = null

    /**
     * 角色介绍
     */
    private var roleIntroduction: String? = null

    /**
     * 角色技能
     */
    private var roleSkills: List<WerewolfSkill>? = null

    /**
     * 角色类型
     */
    var roleType: WerewolfRoleType? = null

    constructor(roleName: String?, roleIntroduction: String?, roleSkills: List<WerewolfSkill>?, roleType: WerewolfRoleType) {
        this.roleName = roleName
        this.roleIntroduction = roleIntroduction
        this.roleSkills = roleSkills
        this.roleType = roleType
    }

}