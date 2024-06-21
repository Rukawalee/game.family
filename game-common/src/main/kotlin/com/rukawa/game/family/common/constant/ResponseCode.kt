package com.rukawa.game.family.common.constant

enum class ResponseCode {

    SUCCESS(200, "请求成功！"),
    FAIL(-1, "请求失败！");

    var code: Int = 0

    var status: String = ""

    constructor(code: Int, status: String) {
        this.code = code
        this.status = status
    }

}