package com.yongche

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.annotation.EnableTransactionManagement

object ApplicationBoot extends App {
  SpringApplication.run(classOf[ApplicationBoot], args: _*)
}

//@Configuration
//@SpringBootApplication
//@EnableTransactionManagement
//@MapperScan(basePackages = Array("com.yongche.data.visualization.mapper"))
//class ApplicationBoot


@Configuration
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages=Array("com.yongche"))
class ApplicationBoot


