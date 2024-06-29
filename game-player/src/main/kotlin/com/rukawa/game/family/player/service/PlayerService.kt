package com.rukawa.game.family.player.service

import com.aventrix.jnanoid.jnanoid.NanoIdUtils
import com.rukawa.game.family.player.adapter.PlayerIconAdapter
import com.rukawa.game.family.player.cache.PlayerCenter
import com.rukawa.game.family.player.converter.PlayerConverter
import com.rukawa.game.family.player.dto.PlayerDTO
import com.rukawa.game.family.player.dto.PlayerLoginCommand
import com.rukawa.game.family.player.dto.PlayerTokenDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PlayerService {

    @Autowired
    private lateinit var playerCenter: PlayerCenter

    @Autowired
    private lateinit var playerIconAdapter: PlayerIconAdapter

    /**
     * 校验玩家登录有效性
     */
    fun isLoginValid(token: String?): Boolean {
        return token?.let {
            playerCenter.onlinePlayerMap.getIfPresent(token)
        }.let {
            Objects.nonNull(it)
        }
    }

    /**
     * 玩家登录
     */
    fun login(playerLoginCommand: PlayerLoginCommand?): PlayerTokenDTO? {
        return playerLoginCommand?.let {
            val playerToken = PlayerTokenDTO()
            val token = NanoIdUtils.randomNanoId()
            val refreshToken = NanoIdUtils.randomNanoId()

            val icon = playerIconAdapter.genIcon()
            val player = PlayerConverter.merge2DTO(playerLoginCommand, icon)

            playerCenter.onlinePlayerMap.put(token, player)
            playerCenter.refreshOnlinePlayerMap.put(refreshToken, player)

            playerToken.token = token
            playerToken.refreshToken = refreshToken
            playerToken
        }
    }

    /**
     * 查询玩家token
     */
    fun queryPlayerToken(token: String?): PlayerTokenDTO? {
        return token?.let {
            playerCenter.onlinePlayerMap.getIfPresent(token)
        }?.let {
            val playerTokenDTO = PlayerTokenDTO()
            playerTokenDTO.token = it.token
            playerTokenDTO.refreshToken = it.refreshToken
            playerTokenDTO
        }
    }

    /**
     * 查询玩家信息
     */
    fun queryPlayer(token: String?): PlayerDTO? {
        return token?.let {
            playerCenter.onlinePlayerMap.getIfPresent(token)
        }
    }

    /**
     * 更新玩家登录token
     */
    fun refreshToken(refreshToken: String?): PlayerTokenDTO? {
        return refreshToken
            ?.let {
                playerCenter.refreshOnlinePlayerMap.getIfPresent(refreshToken)
            }
            ?.let {
                it.token = NanoIdUtils.randomNanoId()
                it.refreshToken = NanoIdUtils.randomNanoId()
                playerCenter.onlinePlayerMap.put(it.token, it)
                playerCenter.refreshOnlinePlayerMap.put(it.refreshToken, it)

                val playerTokenDTO = PlayerTokenDTO()
                playerTokenDTO.token = it.token
                playerTokenDTO.refreshToken = it.refreshToken
                playerTokenDTO
            }
    }

}