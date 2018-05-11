package com.yongche.data.visualization.web.controller

import java.util

import com.yongche.data.visualization.api.VisualService
import com.yongche.visual.WebReturnObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RequestMapping, RestController}


@RestController
@RequestMapping(Array("/test"))
class VisualController @Autowired()(val visualService: VisualService){

  @GetMapping(Array("{id}"))
  def getCreateOrder(@PathVariable("id") AccountId:String):Object={
    visualService.getCreateOrder("bj",15123450000l)

    val ret = new WebReturnObject()
    ret.getInstanceForError(1000,"","")
  }


}
