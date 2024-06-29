package com.rukawa.game.family.route.interceptor

import com.rukawa.game.family.player.service.PlayerService
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpHeaders
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor

@Component
class PlayerLoginInterceptor : HandlerInterceptor {

    @Autowired
    private lateinit var playerService: PlayerService

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        return request.getHeader(HttpHeaders.AUTHORIZATION)
            ?.let {
                val authArr = it.split(" ")
                playerService.isLoginValid(authArr[1])
            } == true
    }
}