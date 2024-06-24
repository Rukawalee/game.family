package com.rukawa.game.family.werewolf.dto.role

import com.rukawa.game.family.common.dto.PageDTO

class WerewolfRoleQuery: PageDTO() {

    var roleName: String? = null

    var campCode: Int? = null

}