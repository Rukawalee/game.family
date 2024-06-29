package com.rukawa.game.family.player.adapter

import com.aventrix.jnanoid.jnanoid.NanoIdUtils
import org.springframework.stereotype.Component

@Component
class PlayerIconAdapter {

    private val RAND_ICON_API: String = "https://api.multiavatar.com/"

    private val ICON_SUFFIX: String = ".svg"

    fun genIcon() : String? {
        val iconId = NanoIdUtils.randomNanoId(NanoIdUtils.DEFAULT_NUMBER_GENERATOR, NanoIdUtils.DEFAULT_ALPHABET, 6)
        return RAND_ICON_API + iconId + ICON_SUFFIX
    }

}