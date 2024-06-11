package com.rukawa.game.family.werewolf

import com.rukawa.game.family.werewolf.dto.SeatDTO

class WerewolfRoom {

    /**
     * 所有座位
     */
    val seats: List<SeatDTO> = ArrayList()

    /**
     * 神位
     */
    val divineSeats: List<SeatDTO> = ArrayList()

    /**
     * 民位
     */
    val villagerSeats: List<SeatDTO> = ArrayList()

    /**
     * 狼位
     */
    val wolfSeats: List<SeatDTO> = ArrayList()

    /**
     * 第三方位
     */
    val thirdSeats: List<SeatDTO> = ArrayList()

}