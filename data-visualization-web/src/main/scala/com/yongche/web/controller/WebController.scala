package com.yongche.web.controller

import java.util
import com.yongche.domain.Account
import com.yongche.service.DemoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RequestMapping, RestController}


@RestController
@RequestMapping(Array("/test"))
class WebController @Autowired()(val demoService: DemoService){

  @GetMapping(Array("{id}"))
  def getAccount(@PathVariable("id") AccountId:String):util.List[Account]={
    demoService.getAccounts(0l,0l)
  }
}
