package com.rukawa.game.family.vo

import org.apache.commons.lang3.StringUtils
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
     * 错误信息
     */
    var msg: String? = null

    /**
     * 成功
     */
    fun success(t: T?): GameResponseVO<T> {
        this.data = t
        this.code = HttpStatus.OK.value()
        return this
    }

    /**
     * 失败
     */
    fun fail(responseStatus: HttpStatus, errorMsg: String): GameResponseVO<T> {
        this.code = responseStatus.value()
        this.msg = errorMsg ?: responseStatus.reasonPhrase
        return this
    }
}