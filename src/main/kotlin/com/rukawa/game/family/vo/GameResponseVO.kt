package com.rukawa.game.family.vo

import com.rukawa.game.family.common.constant.ResponseCode

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
    var status: String? = null

    /**
     * 错误信息
     */
    var msg: String? = null

    /**
     * 成功
     */
    fun success(t:T?): GameResponseVO<T> {
        this.data = t
        this.code = ResponseCode.SUCCESS.code
        this.status = ResponseCode.SUCCESS.status
        return this
    }

    /**
     * 失败
     */
    fun fail(responseCode: ResponseCode, errorMsg:String): GameResponseVO<T> {
        this.code = responseCode.code
        this.status = responseCode.status
        this.msg = errorMsg
        return this
    }
}