package com.rukawa.game.family.werewolf.service

import com.rukawa.game.family.werewolf.constant.WerewolfCampConst
import com.rukawa.game.family.werewolf.converter.WerewolfCampConverter
import com.rukawa.game.family.werewolf.dto.camp.WerewolfCampDTO
import org.springframework.stereotype.Service

@Service
class WerewolfCampQueryService {

    fun queryCamps(): List<WerewolfCampDTO>? {
        val camps = WerewolfCampConst.values()
        return camps?.map { WerewolfCampConverter.campEnum2CampDTO(it) }
    }

}