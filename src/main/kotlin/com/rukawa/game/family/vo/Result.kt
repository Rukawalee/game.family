package com.rukawa.game.family.vo

import com.rukawa.game.family.common.constant.HttpCode

/**
 * 结果
 */
class Result<T> {

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
    fun success(t:T): Result<T> {
        this.data = t
        this.code = HttpCode.SUCCESS.code
        this.msg = HttpCode.SUCCESS.msg
        return this
    }

    /**
     * 失败
     */
    fun fail(status: HttpCode, errorMsg:String): Result<T> {
        this.code = status.code
        this.msg = StringBuilder()
            .append(status.msg)
            .append(": ")
            .append(errorMsg).toString()
        return this
    }
}