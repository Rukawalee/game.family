package com.rukawa.game.family.werewolf.cache

import com.rukawa.game.family.player.dto.PlayerLoginCommand

/**
 * 狼人杀房间
 */
class WerewolfRoom {

    /**
     * 房间号
     */
    var roomId: String? = null

    /**
     * 房间名
     */
    var roomNane: String? = null

    /**
     * 玩家映射
     * key: playerId
     * value: playerDTO
     */
    var playerMap: Map<Int, PlayerLoginCommand> = HashMap()

    /**
     * 座位映射
     * key: seatOrder
     * value: seat
     */
    var werewolfSeatMap: Map<Int, WerewolfSeat> = HashMap()

    /**
     * 村民位
     * value: setOrder
     */
    var villagerSeats: Set<Int> = HashSet()

    /**
     * 狼人位
     * value: seatOrder
     */
    var wolfSeats: Set<Int> = HashSet()

    /**
     * 神位
     * value: seatOrder
     */
    var divineSeats: Set<Int> = HashSet()

    /**
     * 第三方位
     * value: seatOrder
     */
    var thirdSeats: Set<Int> = HashSet()


}