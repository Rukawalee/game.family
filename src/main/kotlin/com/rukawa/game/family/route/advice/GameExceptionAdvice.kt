package com.rukawa.game.family.route.advice

import com.rukawa.game.family.vo.GameResponseVO
import org.apache.commons.lang3.exception.ExceptionUtils
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Component
@ControllerAdvice(annotations = [RestController::class])
class GameExceptionAdvice {

    val logger: Logger = LoggerFactory.getLogger(GameExceptionAdvice::class.java)

    @ResponseBody
    @ExceptionHandler(Exception::class)
    fun exception(e: Exception): GameResponseVO<Any> {
        logger.error("#exception occur: {}", e)
        var response: GameResponseVO<Any> = GameResponseVO()
        val errorMsg = ExceptionUtils.getMessage(e)
        response.fail(HttpStatus.INTERNAL_SERVER_ERROR, errorMsg)
        return response
    }

}