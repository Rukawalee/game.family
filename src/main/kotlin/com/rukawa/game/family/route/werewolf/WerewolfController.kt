package com.rukawa.game.family.route.werewolf

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/werewolf")
class WerewolfController {

    @RequestMapping("/index")
    fun index() = "werewolf"

}