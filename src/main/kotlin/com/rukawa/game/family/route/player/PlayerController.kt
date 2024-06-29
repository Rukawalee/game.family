package com.rukawa.game.family.route.player

import com.rukawa.game.family.player.converter.PlayerTokenConverter
import com.rukawa.game.family.player.dto.PlayerLoginCommand
import com.rukawa.game.family.player.service.PlayerLoginService
import com.rukawa.game.family.player.vo.PlayerInfoVO
import com.rukawa.game.family.player.vo.PlayerTokenVO
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpHeaders
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/api/player")
class PlayerLoginController {

    @Autowired
    private lateinit var playerLoginService: PlayerLoginService

    @PostMapping("/login")
    fun login(@RequestBody playerLoginCommand: PlayerLoginCommand, request: HttpServletRequest): PlayerTokenVO? {
        val token = request.getHeader(HttpHeaders.AUTHORIZATION)
            ?.let { it.split(" ")[1] }
        return playerLoginService.isLoginValid(token)
            ?.let {
                if (it) {
                    val onlineToken = playerLoginService.login(playerLoginCommand)
                    return PlayerTokenConverter.DTO2VO(onlineToken)
                }
                return null
            }
    }

    @GetMapping("/info")
    fun queryPlayerInfo(@RequestHeader requestHeaders: HttpHeaders): PlayerInfoVO? {
        val playerInfoVO = PlayerInfoVO()
        return playerInfoVO
    }

    @PostMapping("/refreshToken")
    fun refreshToken(@RequestParam("refreshToken") refreshToken: String): PlayerTokenVO? {
        val refreshTokenObj = PlayerTokenVO()
        refreshTokenObj.refreshToken = refreshToken
        refreshTokenObj.token = ""
        return refreshTokenObj
    }

}