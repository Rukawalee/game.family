package com.rukawa.game.family.route.werewolf

import com.rukawa.game.family.werewolf.service.WerewolfRoleQueryService
import com.rukawa.game.family.werewolf.vo.role.WerewolfRolePageVO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/api/werewolf/role")
class WerewolfRoleController {

    @Autowired
    private lateinit var werewolfRoleQueryService: WerewolfRoleQueryService

    @PostMapping("list")
    fun queryRoles(): WerewolfRolePageVO? {
        val werewolfRolePageVO = WerewolfRolePageVO()
        val roles = werewolfRoleQueryService.queryRoles()
        werewolfRolePageVO.roles = roles
        return werewolfRolePageVO;
    }

}