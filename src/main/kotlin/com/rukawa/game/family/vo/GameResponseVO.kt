package com.rukawa.game.family.vo

import org.springframework.http.HttpStatus

/**
 * 响应
 */
class GameResponseVO<T> {

    /**
     * 结果数据
     */
    var data: T? = null

    /**
     * 响应编码
     */
    var code: Int = 0

    /**
     * 请求状态
     */
    var reason: String? = null

    /**
     * 错误信息
     */
    var msg: String? = null

    /**
     * 成功
     */
    fun success(t: T?): GameResponseVO<T> {
        this.data = t
        this.code = HttpStatus.OK.value()
        this.reason = HttpStatus.OK.reasonPhrase
        return this
    }

    /**
     * 失败
     */
    fun fail(responseStatus: HttpStatus, errorMsg: String): GameResponseVO<T> {
        this.code = responseStatus.value()
        this.reason = responseStatus.reasonPhrase
        this.msg = errorMsg
        return this
    }
}