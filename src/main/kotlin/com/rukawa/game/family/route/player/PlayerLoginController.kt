package com.rukawa.game.family.route.player

import com.rukawa.game.family.player.dto.PlayerLoginCommand
import com.rukawa.game.family.player.vo.PlayerInfoVO
import com.rukawa.game.family.player.vo.PlayerTokenVO
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/api/player")
class PlayerLoginController {

    @PostMapping("/login")
    fun login(@RequestBody playerLoginCommand: PlayerLoginCommand): PlayerTokenVO? {
        val tokenObj = PlayerTokenVO()
        tokenObj.token = playerLoginCommand.playerName
        tokenObj.refreshToken = playerLoginCommand.playerPassword
        return tokenObj
    }

    @GetMapping("/info")
    fun queryPlayerInfo(): PlayerInfoVO? {
        val playerInfoVO = PlayerInfoVO()
        return playerInfoVO
    }

}