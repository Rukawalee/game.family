package com.rukawa.game.family.common.dto

/**
 * 分页查询
 */
open class PageQueryDTO {

    /**
     * 当前页
     */
    var page: Int = 1

    /**
     * 每页数量
     */
    var pageSize: Int = 10

}