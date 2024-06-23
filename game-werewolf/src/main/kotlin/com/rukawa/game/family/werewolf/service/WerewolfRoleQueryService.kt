package com.rukawa.game.family.werewolf.service

import com.rukawa.game.family.werewolf.constant.WerewolfRoleConst
import com.rukawa.game.family.werewolf.converter.WerewolfRoleConverter
import com.rukawa.game.family.werewolf.dto.role.WerewolfRoleDTO
import org.springframework.stereotype.Service

@Service
class WerewolfRoleQueryService {

    fun queryRoles(): List<WerewolfRoleDTO>? {
        val roles = WerewolfRoleConst.values()
        return roles?.toList()?.let { WerewolfRoleConverter.enumRoles2RoleDTOList(it) }
    }

}