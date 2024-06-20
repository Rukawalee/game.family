package com.rukawa.game.family.route.werewolf

import com.rukawa.game.family.route.werewolf.vo.WerewolfRoomVO
import com.rukawa.game.family.vo.Result
import com.rukawa.game.family.werewolf.dto.WerewolfRoomQueryDTO
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/api/werewolf")
class WerewolfController {

    @PostMapping("/rooms")
    fun queryRooms(@RequestBody werewolfRoomQuery: WerewolfRoomQueryDTO): Result<List<WerewolfRoomVO>> {
        var result:Result<List<WerewolfRoomVO>> = Result()
        return result.success(ArrayList())
    }

}