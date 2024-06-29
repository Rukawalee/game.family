package com.rukawa.game.family.player.cache

import com.github.benmanes.caffeine.cache.Cache
import com.github.benmanes.caffeine.cache.Caffeine
import com.rukawa.game.family.player.dto.PlayerDTO
import org.springframework.stereotype.Component
import java.util.concurrent.TimeUnit

@Component
class PlayerCenter {

    /**
     * key: token
     * value: player
     */
    val onlinePlayerMap: Cache<String, PlayerDTO> = Caffeine.newBuilder()
        .expireAfterAccess(30, TimeUnit.MINUTES)
        .build()

    /**
     * key: refreshToken
     * value: player
     */
    val refreshOnlinePlayerMap: Cache<String, PlayerDTO> = Caffeine.newBuilder()
        .expireAfterAccess(45, TimeUnit.MINUTES)
        .build()

}