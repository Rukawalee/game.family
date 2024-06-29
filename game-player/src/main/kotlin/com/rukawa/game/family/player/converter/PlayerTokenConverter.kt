package com.rukawa.game.family.player.converter

import com.rukawa.game.family.player.dto.PlayerTokenDTO
import com.rukawa.game.family.player.vo.PlayerTokenVO

object PlayerTokenConverter {

    /**
     * DTO 转 VO
     */
    fun DTO2VO(playerToken: PlayerTokenDTO?): PlayerTokenVO? {
        return playerToken?.let {
            val playerTokenVO = PlayerTokenVO()
            playerTokenVO.token = it.token
            playerTokenVO.refreshToken = it.refreshToken
            playerTokenVO
        }
    }

}