package com.yongche.domain

import scala.beans.BeanProperty

class Bignum {
  @BeanProperty var kuduId: String = _
  @BeanProperty var accountId: String = _
  @BeanProperty var userId: String = _

  override def toString = s"Account(kuduId=$kuduId, accountId=$accountId, userId=$userId)"
}

