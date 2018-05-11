package com.yongche.data.visualization.mapper

import java.util

import com.yongche.domain.Account
import org.apache.ibatis.annotations.Mapper

@Mapper
trait AccountMapper {
  def getAccount: util.List[Account]
}
