package com.rukawa.game.family.werewolf.service

import com.rukawa.game.family.werewolf.constant.WerewolfRoleConst
import com.rukawa.game.family.werewolf.converter.WerewolfRoleConverter
import com.rukawa.game.family.werewolf.dto.role.WerewolfRoleDTO
import com.rukawa.game.family.werewolf.dto.role.WerewolfRoleQuery
import io.micrometer.common.util.StringUtils
import org.springframework.stereotype.Service
import org.springframework.util.CollectionUtils
import java.util.*

@Service
class WerewolfRoleQueryService {

    fun queryRoles(roleQuery: WerewolfRoleQuery): List<WerewolfRoleDTO>? {
        val roles = WerewolfRoleConst.values()
        val filterRoles = roles?.filter {
                if (StringUtils.isBlank(roleQuery?.roleName)) true
                else roleQuery?.roleName
                    ?.let { name -> it.roleName?.contains(name) } == true
            }
            ?.let { WerewolfRoleConverter.roleEnums2RoleDTOList(it) }
            ?.filter {
                if (Objects.isNull(roleQuery?.campCode)) true
                else roleQuery?.campCode
                    ?.let { code -> it.roleCamp?.campCode == code } == true
            }
        roleQuery.total = filterRoles?.size
        if (CollectionUtils.isEmpty(filterRoles)) {
            return filterRoles
        }
        val from = ((roleQuery.page - 1) * roleQuery.pageSize)
            .let { if (it > filterRoles?.size!!) 0 else it }
        val to = (roleQuery.page * roleQuery.pageSize)
            .let { if (it > filterRoles?.size!!) filterRoles.size else it }
        return filterRoles?.subList(from, to)
    }

}