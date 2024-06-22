package com.rukawa.game.family.route.werewolf

import com.rukawa.game.family.werewolf.vo.WerewolfRoomVO
import com.rukawa.game.family.werewolf.dto.WerewolfRoomQueryDTO
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/api/werewolf/room")
class WerewolfRoomController {

    @PostMapping("/list")
    fun queryRooms(@RequestBody werewolfRoomQuery: WerewolfRoomQueryDTO): List<WerewolfRoomVO> {
        return ArrayList()
    }

}