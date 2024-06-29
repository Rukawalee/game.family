package com.rukawa.game.family.player.converter

import com.rukawa.game.family.player.dto.PlayerDTO
import com.rukawa.game.family.player.dto.PlayerLoginCommand
import com.rukawa.game.family.player.factory.PlayerIDFactory
import com.rukawa.game.family.player.vo.PlayerInfoVO

object PlayerConverter {

    /**
     * 玩家登录信息转DTO
     */
    fun merge2DTO(playerLoginCommand: PlayerLoginCommand?, icon: String?): PlayerDTO? {
        return playerLoginCommand?.let {
            val player = PlayerDTO()
            player.playerName = playerLoginCommand.playerName
            player.playerIcon = icon
            player.playerId = PlayerIDFactory.uniqueId()
            player
        }
    }

    /**
     * 玩家信息转VO
     */
    fun DTO2VO(playerDTO: PlayerDTO?): PlayerInfoVO? {
        return playerDTO
            ?.let {
                val playerInfoVO = PlayerInfoVO()
                playerInfoVO.playerId = it.playerId
                playerInfoVO.playerName = it.playerName
                playerInfoVO.playerIcon = it.playerIcon
                playerInfoVO
            }
    }

}