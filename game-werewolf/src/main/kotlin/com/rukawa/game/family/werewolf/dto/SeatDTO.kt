package com.rukawa.game.family.werewolf.dto

import com.rukawa.game.family.player.dto.PlayerDTO
import com.rukawa.game.family.werewolf.enums.WerewolfStatus

class SeatDTO {

    /**
     * 座位号
     */
    var seatId: Int? = null

    /**
     * 座位序号
     */
    var seatOrder: Int = 0

    /**
     * 玩家（座位）状态
     */
    var seatStatus: WerewolfStatus = WerewolfStatus.SURVIVE

    /**
     * 玩家
     */
    var player: PlayerDTO? = null

    /**
     * 玩家角色
     */
    var werewolf: WerewolfDTO? = null

}