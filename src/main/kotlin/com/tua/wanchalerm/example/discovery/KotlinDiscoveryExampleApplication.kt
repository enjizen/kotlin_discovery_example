package com.tua.wanchalerm.example.discovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class KotlinDiscoveryExampleApplication

fun main(args: Array<String>) {
	runApplication<KotlinDiscoveryExampleApplication>(*args)
}
