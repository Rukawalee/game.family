package com.rukawa.game.family.werewolf.vo.role

import com.rukawa.game.family.common.dto.PageDTO
import com.rukawa.game.family.werewolf.dto.role.WerewolfRoleDTO

/**
 * 狼人杀角色
 */
class WerewolfRolePageVO : PageDTO() {

    var roles: List<WerewolfRoleDTO>? = null

}