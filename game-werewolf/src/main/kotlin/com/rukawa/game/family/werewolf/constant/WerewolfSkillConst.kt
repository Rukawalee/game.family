package com.rukawa.game.family.werewolf.constant

/**
 * 狼人杀技能
 */
enum class WerewolfSkillConst {

    /**
     * 黑夜击杀
     */
    SKILL_NIGHT_KILL("黑夜击杀", listOf("玩家在黑夜可以击杀一名未出局玩家。")),

    /**
     * 白天自爆
     */
    SKILL_DAYTIME_SELF_EXPLOSION("白天自爆", listOf("玩家在白天自爆身份出局，所有玩家终止发言进入黑夜。")),

    /**
     * 开枪
     */
    SKILL_SHOOT("开枪击杀", listOf("玩家出局后可以开枪击杀一名未出局玩家。")),

    /**
     * 黑夜毒杀
     */
    SKILL_NIGHT_POISON("黑夜毒杀", listOf("玩家在黑夜可以毒杀一名未出局玩家。")),

    /**
     * 黑夜解救
     */
    SKILL_NIGHT_RESCUE("黑夜解救", listOf("玩家在黑夜可以解救一名被击杀玩家。")),

    /**
     * 黑夜验证
     */
    SKILL_NIGHT_PREDICT("黑夜验证", listOf("玩家在黑夜可以验证一名玩家身份。")),

    /**
     * 黑夜守护
     */
    SKILL_NIGHT_PROTECT("黑夜守护", listOf("玩家在黑夜可以守护一名玩家不出局。"));

    /**
     * 技能名
     */
    var skillName: String? = null

    /**
     * 技能介绍
     */
    var skillIntroductions: List<String>? = null

    constructor(skillName: String?, skillIntroductions: List<String>?) {
        this.skillName = skillName
        this.skillIntroductions = skillIntroductions
    }

}