package com.rsowell.dungeonbuilder.control

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @RequestMapping("")
    fun alive() = "<xml>Alive</xml>"
}