package com.rukawa.game.family.werewolf.converter

import com.rukawa.game.family.werewolf.constant.WerewolfCampConst
import com.rukawa.game.family.werewolf.constant.WerewolfRoleConst
import com.rukawa.game.family.werewolf.converter.WerewolfCampConverter.campEnum2CampDTO
import com.rukawa.game.family.werewolf.dto.role.WerewolfRoleDTO
import org.springframework.beans.BeanUtils
import java.util.*

object WerewolfRoleConverter {

    /**
     * 角色枚举转换成 DTO
     *
     * @param role
     * @return
     */
    fun roleEnum2RoleDTO(role: WerewolfRoleConst?): WerewolfRoleDTO {
        val werewolfRoleDTO = WerewolfRoleDTO()
        if (Objects.isNull(role)) {
            return werewolfRoleDTO
        }
        BeanUtils.copyProperties(role, werewolfRoleDTO)
        val werewolfSkillDTOS = WerewolfSkillConverter.skillEnums2SkillDTOList(role?.roleSkills)
        werewolfRoleDTO.roleSkills = werewolfSkillDTOS
        val werewolfCampConst = WerewolfCampConst.roleOf(role?.roleType)
        val werewolfCampDTO = campEnum2CampDTO(werewolfCampConst)
        werewolfRoleDTO.roleCamp = werewolfCampDTO
        return werewolfRoleDTO
    }

    /**
     * 角色枚举转换成 DTO 集合
     *
     * @param roles
     * @return
     */
    fun roleEnums2RoleDTOList(roles: List<WerewolfRoleConst>?): List<WerewolfRoleDTO>? {
        return roles?.map { roleEnum2RoleDTO(it) }
    }

}
