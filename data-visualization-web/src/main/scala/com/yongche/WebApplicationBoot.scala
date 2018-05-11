package com.yongche

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.{Configuration, ImportResource}

object WebApplicationBoot extends App {
  SpringApplication.run(classOf[WebApplicationBoot], args: _*)
}

@SpringBootApplication
class WebApplicationBoot

@Configuration
@ImportResource(Array("classpath*:/dubbo/*.xml"))
class WebApplicationBootConfigDubbo

@Configuration
class ApplicationBootConfigJackson {

  @Autowired(required = false)
  def configObjectMapper(objectMapper: ObjectMapper): Unit = {
    objectMapper.registerModules(DefaultScalaModule)
  }

}