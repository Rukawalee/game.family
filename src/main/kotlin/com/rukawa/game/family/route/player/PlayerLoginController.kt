package com.rukawa.game.family.route.player

import com.rukawa.game.family.player.dto.PlayerLoginCommand
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/api/player")
class PlayerLoginController {

    @PostMapping("/login")
    fun login(@RequestBody playerLoginCommand: PlayerLoginCommand): String? {
        return playerLoginCommand.playerName
    }

}