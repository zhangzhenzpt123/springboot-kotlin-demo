package org.zhangz.springbootkotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class SpringbootKotlinDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringbootKotlinDemoApplication>(*args)
}

data class Message(val id: String?, val text: String)