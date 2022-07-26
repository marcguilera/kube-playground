package kube.playground.controller

import kube.playground.config.Config
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.CacheControl
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
class ConfigController(private val config: Config) {
    @GetMapping
    fun test() = ResponseEntity.ok().cacheControl(CacheControl.noCache()).body(config.value)
}
