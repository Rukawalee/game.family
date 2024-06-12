package com.rukawa.game.family.werewolf.cache

import com.rukawa.game.family.player.dto.PlayerDTO
import com.rukawa.game.family.werewolf.enums.WerewolfStatus

/**
 * 座位
 */
class Seat {

    /**
     * 座位序号
     */
    var seatOrder: Int = 0

    /**
     * 座位（玩家）状态
     */
    var status: WerewolfStatus = WerewolfStatus.SURVIVE

    /**
     * 玩家
     */
    var player: PlayerDTO? = null

    /**
     * 狼人杀角色
     */
    var werewolfRole: WerewolfRole? = null

}