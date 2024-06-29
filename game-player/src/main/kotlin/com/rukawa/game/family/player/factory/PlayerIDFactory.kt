package com.rukawa.game.family.player.factory

import java.util.concurrent.atomic.AtomicInteger

object PlayerIDFactory {

    private val playerId: AtomicInteger = AtomicInteger()

    fun uniqueId(): Int? {
        synchronized(playerId) {
            return playerId.incrementAndGet()
        }
    }

}