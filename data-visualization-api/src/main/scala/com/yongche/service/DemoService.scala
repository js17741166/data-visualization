package com.yongche.service

import java.util
import com.yongche.domain.Account

trait DemoService {
  def getAccounts(startId: Long, endId: Long): util.List[Account]



}
