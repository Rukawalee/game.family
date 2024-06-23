package com.rukawa.game.family.werewolf.constant

import java.util.*

/**
 * 狼人杀阵营
 */
enum class WerewolfCampConst {

    /**
     * 好人阵营
     */
    ROLE_CAMP_GOOD(1, "好人", setOf(WerewolfRoleTypeConst.ROLE_TYPE_CITIZEN, WerewolfRoleTypeConst.ROLE_TYPE_DEITY)),

    /**
     * 坏人阵营
     */
    ROLE_CAMP_BAD(2, "坏人", setOf(WerewolfRoleTypeConst.ROLE_TYPE_WEREWOLF)),

    /**
     * 第三方阵营
     */
    ROLE_CAMP_THIRD(3, "第三方", setOf(WerewolfRoleTypeConst.ROLE_TYPE_SPECIAL));

    /**
     * 阵营编码
     */
    var campCode: Int? = null

    /**
     * 阵营介绍
     */
    var campName: String? = null

    /**
     * 角色类型集合
     */
    var roleTypes: Set<WerewolfRoleTypeConst>? = null

    constructor(campCode: Int?, campName: String?, roleTypes: Set<WerewolfRoleTypeConst>?) {
        this.campCode = campCode
        this.campName = campName
        this.roleTypes = roleTypes
    }

    companion object {

        var roleCampMap: Map<WerewolfRoleTypeConst, WerewolfCampConst> = mutableMapOf(
            WerewolfRoleTypeConst.ROLE_TYPE_CITIZEN to ROLE_CAMP_GOOD,
            WerewolfRoleTypeConst.ROLE_TYPE_DEITY to ROLE_CAMP_GOOD,
            WerewolfRoleTypeConst.ROLE_TYPE_WEREWOLF to ROLE_CAMP_BAD,
            WerewolfRoleTypeConst.ROLE_TYPE_SPECIAL to ROLE_CAMP_THIRD
        )

        @JvmStatic
        fun roleOf(roleType: WerewolfRoleTypeConst?): WerewolfCampConst? {
            if (Objects.isNull(roleType)) {
                return ROLE_CAMP_THIRD
            }
            return roleCampMap.get(roleType)
        }
    }

}