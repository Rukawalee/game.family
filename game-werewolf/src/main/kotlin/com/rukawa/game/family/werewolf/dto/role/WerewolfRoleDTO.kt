package com.rukawa.game.family.werewolf.dto.role

import com.rukawa.game.family.werewolf.dto.camp.WerewolfCampDTO
import com.rukawa.game.family.werewolf.dto.skill.WerewolfSkillDTO

class WerewolfRoleDTO {

    var roleName: String? = null

    var roleIntroduction: String? = null

    var roleSkills: List<WerewolfSkillDTO>? = null

    var roleCamp: WerewolfCampDTO? = null

}