package com.rukawa.game.family.werewolf.converter

import com.rukawa.game.family.werewolf.constant.WerewolfCampConst
import com.rukawa.game.family.werewolf.dto.camp.WerewolfCampDTO
import org.springframework.beans.BeanUtils
import java.util.*

object WerewolfCampConverter {

    /**
     * 阵营枚举转换成 DTO
     *
     * @param camp
     * @return
     */
    @JvmStatic
    fun campEnum2CampDTO(camp: WerewolfCampConst?): WerewolfCampDTO {
        val werewolfCampDTO = WerewolfCampDTO()
        if (Objects.isNull(camp)) {
            return werewolfCampDTO
        }
        BeanUtils.copyProperties(camp, werewolfCampDTO)
        return werewolfCampDTO
    }
}
