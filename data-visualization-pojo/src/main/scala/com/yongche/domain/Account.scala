package com.yongche.domain

import scala.beans.BeanProperty

class Account {
  @BeanProperty var kuduId: String = _
  @BeanProperty var accountId: String = _
  @BeanProperty var userId: String = _

  override def toString = s"Account(kuduId=$kuduId, accountId=$accountId, userId=$userId)"
}

object Account {
  def apply(kuduId: String, accountId: String, userId: String): Account = {
    val account = new Account()
    account.kuduId = kuduId
    account.accountId = accountId
    account.userId = userId
    account
  }
}