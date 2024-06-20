package com.rukawa.game.family.common.constant

enum class HttpCode {

    SUCCESS(200, "请求成功！"),
    FAIL(-1, "请求失败！");

    var code: Int = 0

    var msg: String = ""

    constructor(code: Int, msg: String) {
        this.code = code
        this.msg = msg
    }

}