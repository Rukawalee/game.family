package com.rukawa.game.family.werewolf.constant

enum class WerewolfRoleConst {

    /**
     * 村民
     */
    ROLE_VILLAGER("村民", "没有技能，黑夜闭眼玩家。", null, WerewolfRoleTypeConst.ROLE_TYPE_CITIZEN),

    /**
     * 狼人
     */
    ROLE_WEREWOLF("狼人", "每晚里可以击杀一名玩家。", listOf(WerewolfSkillConst.SKILL_NIGHT_KILL, WerewolfSkillConst.SKILL_DAYTIME_SELF_EXPLOSION), WerewolfRoleTypeConst.ROLE_TYPE_WEREWOLF),

    /**
     * 狼王
     */
    ROLE_WEREWOLF_KING("狼王", "出局（非殉情、毒杀）后可以开枪击杀一名玩家。", listOf(WerewolfSkillConst.SKILL_NIGHT_KILL, WerewolfSkillConst.SKILL_DAYTIME_SELF_EXPLOSION, WerewolfSkillConst.SKILL_SHOOT), WerewolfRoleTypeConst.ROLE_TYPE_WEREWOLF),

    /**
     * 女巫
     */
    ROLE_WITCH("女巫", "有两瓶药，解药可以解救一名玩家，毒药可以毒杀一名玩家，每晚只能用一瓶药。", listOf(WerewolfSkillConst.SKILL_NIGHT_POISON, WerewolfSkillConst.SKILL_NIGHT_RESCUE), WerewolfRoleTypeConst.ROLE_TYPE_DEITY),

    /**
     * 预言家
     */
    ROLE_PROPHET("预言家", "每晚可以查看一名玩家身份。", listOf(WerewolfSkillConst.SKILL_NIGHT_PREDICT), WerewolfRoleTypeConst.ROLE_TYPE_DEITY),

    /**
     * 守卫
     */
    ROLE_GUARD("守卫", "每晚可以守护一名玩家不出局，不能连续两晚守护同一名玩家。", listOf(WerewolfSkillConst.SKILL_NIGHT_PROTECT), WerewolfRoleTypeConst.ROLE_TYPE_DEITY),

    /**
     * 猎人
     */
    ROLE_HUNTER("猎人", "出局（狼杀、票杀）后可以开枪击杀一名玩家。", listOf(WerewolfSkillConst.SKILL_SHOOT), WerewolfRoleTypeConst.ROLE_TYPE_DEITY);

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
    var roleSkills: List<WerewolfSkillConst>? = null

    /**
     * 角色类型
     */
    var roleType: WerewolfRoleTypeConst? = null

    constructor(roleName: String?, roleIntroduction: String?, roleSkills: List<WerewolfSkillConst>?, roleType: WerewolfRoleTypeConst) {
        this.roleName = roleName
        this.roleIntroduction = roleIntroduction
        this.roleSkills = roleSkills
        this.roleType = roleType
    }

}