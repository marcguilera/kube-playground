package kube.playground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class PlaygroundApplication

fun main(args: Array<String>) {
    runApplication<PlaygroundApplication>(*args)
}

