package com.rukawa.game.family.route.werewolf

import com.rukawa.game.family.werewolf.vo.room.WerewolfRoomPageVO
import com.rukawa.game.family.werewolf.dto.room.WerewolfRoomDTO
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/api/werewolf/room")
class WerewolfRoomController {

    @PostMapping("/list")
    fun queryRooms(@RequestBody werewolfRoomQuery: WerewolfRoomDTO): WerewolfRoomPageVO? {
        return null
    }

}