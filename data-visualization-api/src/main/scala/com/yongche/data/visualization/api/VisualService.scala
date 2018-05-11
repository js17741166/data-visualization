package com.yongche.data.visualization.api


trait VisualService {

  /**
    * 平台当日创建订单量
    * @param city
    * @param timestamp
    * @return
    */
  def getCreateOrder(city: String, timestamp: Long): Object

  /**
    * 平台当日完成订单量
    * @param city
    * @param timestamp
    * @return
    */
  def getDownOrder(city: String, timestamp: Long): Object

  /**
    * 平台累计里程_公里
    * @param city
    * @param timestamp
    * @return
    */
  def getSumMileage(city: String, timestamp: Long): Object

  /**
    * 平台累计服务时长_小时
    * @param city
    * @param timestamp
    * @return
    */
  def getSumServiceHour(city: String, timestamp: Long): Object

  /**
    * 平台实时需求量
    * @param city
    * @param timestamp
    * @return
    */
  def getDemand(city: String, timestamp: Long): Object

  /**
    * 平台实时运力
    * @param city
    * @param timestamp
    * @return
    */
  def getSupply(city: String, timestamp: Long): Object

  /**
    * 平台订单按照车型分布情况
    * 城市提供前12个小时数据
    * 全国提供一个小时数据
    * @param city
    * @param timestamp
    * @return
    */
  def getOrderDistribution(city: String, timestamp: Long) :Object


  /**
    * 平台完成单量top10城市列表以及对应完成单量
    * @param timestamp
    * @return
    */
  def getTopNOrderByCity(timestamp: Long) :Object

  /**
    * 供需状态折线图（12小时数据）
    * @param city
    * @param timestamp
    * @return
    */
  def getSupplyDemandStatus(city: String, timestamp: Long) :Object

}
