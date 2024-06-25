package com.rukawa.game.family.werewolf.cache

import com.rukawa.game.family.player.dto.PlayerLoginCommand
import com.rukawa.game.family.werewolf.constant.WerewolfRoleConst
import com.rukawa.game.family.werewolf.constant.WerewolfStatusConst

/**
 * 狼人杀座位
 */
class WerewolfSeat {

    /**
     * 座位序号
     */
    var seatOrder: Int = 0

    /**
     * 座位（玩家）状态
     */
    var status: WerewolfStatusConst = WerewolfStatusConst.REMAIN

    /**
     * 玩家
     */
    var player: PlayerLoginCommand? = null

    /**
     * 狼人杀角色
     */
    var werewolfRoleConst: WerewolfRoleConst? = null

}