package com.rukawa.game.family.route.werewolf

import com.rukawa.game.family.werewolf.dto.role.WerewolfRoleQuery
import com.rukawa.game.family.werewolf.service.WerewolfRoleQueryService
import com.rukawa.game.family.werewolf.vo.role.WerewolfRolePageVO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/api/werewolf/role")
class WerewolfRoleController {

    @Autowired
    private lateinit var werewolfRoleQueryService: WerewolfRoleQueryService

    @PostMapping("list")
    fun queryRoles(@RequestBody roleQuery: WerewolfRoleQuery): WerewolfRolePageVO? {
        val werewolfRolePageVO = WerewolfRolePageVO()
        val roles = werewolfRoleQueryService.queryRoles(roleQuery)
        werewolfRolePageVO.roles = roles
        werewolfRolePageVO.total = roleQuery.total
        return werewolfRolePageVO;
    }

}