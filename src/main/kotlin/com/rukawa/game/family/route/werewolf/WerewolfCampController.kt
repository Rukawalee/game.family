package com.rukawa.game.family.route.werewolf

import com.rukawa.game.family.werewolf.service.WerewolfCampQueryService
import com.rukawa.game.family.werewolf.vo.camp.WerewolfCampPageVO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/api/werewolf/camp")
class WerewolfCampController {

    @Autowired
    private lateinit var werewolfCampQueryService: WerewolfCampQueryService

    @GetMapping("/list")
    fun queryCamps(): WerewolfCampPageVO? {
        val werewolfCampPageVO = WerewolfCampPageVO()
        val camps = werewolfCampQueryService.queryCamps()
        werewolfCampPageVO.total = camps?.size
        werewolfCampPageVO.camps = camps
        return werewolfCampPageVO
    }

}