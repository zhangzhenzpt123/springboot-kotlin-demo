package org.zhangz.springbootkotlindemo.action

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.zhangz.springbootkotlindemo.Message
import org.zhangz.springbootkotlindemo.service.MessageService

@RestController
class MessageController(var service: MessageService) {

    @GetMapping("/")
    fun index(): List<Message> = service.findMessages()

    @PostMapping("/")
    fun post(@RequestBody message: Message) {
        service.save(message)
    }
}