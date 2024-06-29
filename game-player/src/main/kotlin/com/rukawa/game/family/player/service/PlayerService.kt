package com.rukawa.game.family.player.service

import com.aventrix.jnanoid.jnanoid.NanoIdUtils
import com.rukawa.game.family.player.adapter.PlayerIconAdapter
import com.rukawa.game.family.player.cache.PlayerCenter
import com.rukawa.game.family.player.converter.PlayerConverter
import com.rukawa.game.family.player.dto.PlayerLoginCommand
import com.rukawa.game.family.player.dto.PlayerTokenDTO
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Slf4j
@Service
class PlayerLoginService {

    @Autowired
    private lateinit var playerCenter: PlayerCenter

    @Autowired
    private lateinit var playerIconAdapter: PlayerIconAdapter

    /**
     * 校验玩家登录有效性
     */
    fun isLoginValid(token: String?): Boolean {
        val onlinePlayer = playerCenter.onlinePlayerMap
            .getIfPresent(token)
        return Objects.nonNull(onlinePlayer)
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

}