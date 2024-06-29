package com.rukawa.game.family.route.config

import com.rukawa.game.family.route.interceptor.PlayerLoginInterceptor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class PlayerLoginConfig : WebMvcConfigurer {

    @Autowired
    private lateinit var playerLoginInterceptor: PlayerLoginInterceptor

    override fun addInterceptors(registry: InterceptorRegistry) {
        val newRegistry = registry.addInterceptor(playerLoginInterceptor)
        newRegistry.addPathPatterns("/api/**")
        newRegistry.excludePathPatterns("/api/**/login")
    }
}