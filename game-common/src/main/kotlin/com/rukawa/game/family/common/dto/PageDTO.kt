package com.rukawa.game.family.common.dto

/**
 * 分页查询
 */
open class PageDTO {

    /**
     * 当前页
     */
    var page: Int = 1

    /**
     * 每页数量
     */
    var pageSize: Int = 10

    /**
     * 总数
     */
    var total: Int? = null

}