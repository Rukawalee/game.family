package com.rukawa.game.family.werewolf.dto

import com.rukawa.game.family.common.dto.PageQueryDTO

/**
 * 狼人杀房间查询对象
 */
class WerewolfRoomQueryDTO : PageQueryDTO() {

    /**
     * 房间名
     */
    var roomName: String? = null

}