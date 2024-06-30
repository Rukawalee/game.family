package com.rukawa.game.family.route.player

import com.rukawa.game.family.player.converter.PlayerConverter
import com.rukawa.game.family.player.converter.PlayerTokenConverter
import com.rukawa.game.family.player.dto.PlayerLoginCommand
import com.rukawa.game.family.player.service.PlayerService
import com.rukawa.game.family.player.vo.PlayerInfoVO
import com.rukawa.game.family.player.vo.PlayerTokenVO
import jakarta.servlet.http.HttpServletRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpHeaders
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/api/player")
class PlayerController {

    @Autowired
    private lateinit var playerService: PlayerService

    @PostMapping("/login")
    fun login(@RequestBody playerLoginCommand: PlayerLoginCommand, request: HttpServletRequest): PlayerTokenVO? {
        val token = request.getHeader(HttpHeaders.AUTHORIZATION)
            ?.let { it.split(" ")[1] }
        val isLoginValid = playerService.isLoginValid(token)
        if (!isLoginValid) {
            val onlineToken = playerService.login(playerLoginCommand)
            return PlayerTokenConverter.DTO2VO(onlineToken)
        }
        val queryPlayerToken = playerService.queryPlayerToken(token)
        return PlayerTokenConverter.DTO2VO(queryPlayerToken)
    }

    @GetMapping("/info")
    fun queryPlayerInfo(request: HttpServletRequest): PlayerInfoVO? {
        return request.getHeader(HttpHeaders.AUTHORIZATION)
            ?.let {
                val authArr = it.split(" ")
                val queryPlayer = playerService.queryPlayer(authArr[1])
                PlayerConverter.DTO2VO(queryPlayer)
            }
    }

    @PostMapping("/refreshToken")
    fun refreshToken(@RequestParam("refreshToken") refreshToken: String): PlayerTokenVO? {
        return playerService.refreshToken(refreshToken)
            ?.let {
                PlayerTokenConverter.DTO2VO(it)
            }
    }

}