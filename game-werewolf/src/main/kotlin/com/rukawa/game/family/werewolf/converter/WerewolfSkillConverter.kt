package com.rukawa.game.family.werewolf.converter

import com.rukawa.game.family.werewolf.constant.WerewolfSkillConst
import com.rukawa.game.family.werewolf.dto.skill.WerewolfSkillDTO
import org.springframework.beans.BeanUtils
import java.util.*

object WerewolfSkillConverter {

    /**
     * 技能枚举转换成 DTO
     *
     * @param skill
     * @return
     */
    fun skillEnum2SkillDTO(skill: WerewolfSkillConst?): WerewolfSkillDTO {
        val werewolfSkillDTO = WerewolfSkillDTO()
        if (Objects.isNull(skill)) {
            return werewolfSkillDTO
        }
        BeanUtils.copyProperties(skill, werewolfSkillDTO)
        return werewolfSkillDTO
    }

    /**
     * 技能枚举转换成 DTO 集合
     *
     * @param skills
     * @return
     */
    fun skillEnums2SkillDTOList(skills: List<WerewolfSkillConst>?): List<WerewolfSkillDTO>? {
        return skills?.map { skillEnum2SkillDTO(it) }
    }
}
