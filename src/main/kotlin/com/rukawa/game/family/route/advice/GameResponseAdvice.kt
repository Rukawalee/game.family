package com.rukawa.game.family.route.advice

import com.rukawa.game.family.common.constant.ResponseCode
import com.rukawa.game.family.vo.GameResponseVO
import org.apache.commons.lang3.exception.ExceptionUtils
import org.springframework.core.MethodParameter
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice

/**
 * 统一响应
 */
@Component
@ControllerAdvice(annotations = [RestController::class])
class GameResponseAdvice : ResponseBodyAdvice<Any> {

    override fun supports(returnType: MethodParameter, converterType: Class<out HttpMessageConverter<*>>): Boolean {
        return true
    }

    override fun beforeBodyWrite(
        body: Any?,
        returnType: MethodParameter,
        selectedContentType: MediaType,
        selectedConverterType: Class<out HttpMessageConverter<*>>,
        request: ServerHttpRequest,
        response: ServerHttpResponse
    ): Any? {
        var response:GameResponseVO<Any> = GameResponseVO()
        try {
            response.success(body)
        } catch (e: Exception) {
            val errorMsg = ExceptionUtils.getMessage(e)
            response.fail(ResponseCode.FAIL, errorMsg)
        }
        return response
    }

}