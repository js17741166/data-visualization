package com.yongche.data.visualization.service.impl

import java.util

import com.yongche.data.visualization.api.VisualService
import com.yongche.domain.{Account, Bignum}
//import com.yongche.utils.{ImpalaClient, ImpalaValue}
import org.springframework.stereotype.Component

@Component
class VisualServiceImpl extends AnyRef with VisualService {

 /* val IMPALAD_HOST=
  val IMPALAD_JDBC_PORT = "21050"
  val CONNECTION_URL = "jdbc:impala://" + IMPALAD_HOST + ':' + IMPALAD_JDBC_PORT + "/;auth=noSasl";
  val JDBC_DRIVER_NAME = "com.cloudera.impala.jdbc41.Driver";
  Class.forName(JDBC_DRIVER_NAME);
  val con = DriverManager.getConnection(CONNECTION_URL);
  val stmt = con.createStatement();*/
//  lazy val config=getDefaultConfiguration.getKuduConfiguration
//  lazy val IMPALA_HOST ="172.17.10.62"
//  lazy val IMPALA_PORT ="21000"
//  lazy val client = ImpalaClient(IMPALA_HOST, Integer.valueOf(IMPALA_PORT))

  /**
    * 平台当日创建订单量
    * @param city
    * @param timestamp
    * @return
    */
  override def getCreateOrder(city: String, timestamp: Long): Object = {

    val singleCity = " and city = "+ city

    val currentSql = "select count(operate_type) from xxx where operate_type='INSERT' and city = "+ city +"  and update_time >= unix_timestamp(from_unixtime(unix_timestamp(),'yyyy-MM-dd'),'yyyy-MM-dd') and update_time < " + timestamp
    val oneMinBeforeSql = "select count(operate_type) from xxx where operate_type='INSERT' and city = "+ city +" and update_time >= unix_timestamp(from_unixtime(unix_timestamp(),'yyyy-MM-dd'),'yyyy-MM-dd') and update_time < " + (timestamp - 3600)

    // TODO 查询数据



    // 判断是返回全国还是返回城市
    if(city.equals("china")){

    }else if("".contains(city)){

    }



    null
  }

  /**
    * 平台当日完成订单量
    * @param city
    * @param timestamp
    * @return
    */
  override def getDownOrder(city: String, timestamp: Long): AnyRef = {

    val singleCity = " and city = "+ city

    val currentSql = "select count(status) from xxx where status=7 and city = "+ city +" and update_time >= unix_timestamp(from_unixtime(unix_timestamp(),'yyyy-MM-dd'),'yyyy-MM-dd') and update_time < " + timestamp
    // 计算1分钟前的数据
    val oneMinBeforeSql = "select count(status) from xxx where status=7 and city = "+ city +" and update_time >= unix_timestamp(from_unixtime(unix_timestamp(),'yyyy-MM-dd'),'yyyy-MM-dd') and update_time < " + (timestamp - 3600)

    null
  }

  /**
    * 平台累计里程_公里
    * @param city
    * @param timestamp
    * @return
    */
  override def getSumMileage(city: String, timestamp: Long): AnyRef = {

    val singleCity = " and city = "+ city

    val currentSql = "select sum(system_distance) from xxx where status=7 and city = "+ city +" and update_time >= unix_timestamp(from_unixtime(unix_timestamp(),'yyyy-MM-dd'),'yyyy-MM-dd') and update_time < " + timestamp
    val oneMinBeforeSql = "select sum(system_distance) from xxx where status=7 and city = "+ city +" and update_time >= unix_timestamp(from_unixtime(unix_timestamp(),'yyyy-MM-dd'),'yyyy-MM-dd') and update_time < " + (timestamp - 3600)

    null
  }


  /**
    * 平台累计服务时长_小时
    * @param city
    * @param timestamp
    * @return
    */
  override def getSumServiceHour(city: String, timestamp: Long): AnyRef = {

    val singleCity = " and city = "+ city

    val currentSql = "select sum(end_time - start_time) as time from xxx where status=7 and city = "+ city +" and update_time >= unix_timestamp(from_unixtime(unix_timestamp(),'yyyy-MM-dd'),'yyyy-MM-dd') and update_time < " + timestamp
    val oneMinBeforeSql = "select sum(end_time - start_time) as time from xxx where status=7 and city = "+ city +" and update_time >= unix_timestamp(from_unixtime(unix_timestamp(),'yyyy-MM-dd'),'yyyy-MM-dd') and update_time < " + (timestamp - 3600)

    null
  }


  /**
    * 平台实时需求量
    * @param city
    * @param timestamp
    * @return
    */
  override def getDemand(city: String, timestamp: Long): AnyRef = {

    val singleCity = " and city = "+ city

    val currentSql = "select count(operate_type) from xxx where operate_type='INSERT' and city = " + city + " and update_time >= " + (timestamp - 7200) + "and update_time < " + timestamp
    val oneMinBeforeSql = "select count(operate_type) from xxx where operate_type='INSERT' and city = " + city + " and update_time >= " + (timestamp - 10800) + "and update_time < " + (timestamp - 3600)

    null
  }


  /**
    * 平台实时运力
    * @param city
    * @param timestamp
    * @return
    */
  override def getSupply(city: String, timestamp: Long): AnyRef = {


    // TODO 需要解析城市
    val
    val currentSql = "select count(operate_type) from xxx where status=0 and  ts >= "+ (timestamp - 7200) +" and ts < " + timestamp
    val oneMinBeforeSql = "select count(operate_type) from xxx where status=0 and  ts >= "+ (timestamp - 10800) +" and ts < " + (timestamp - 3600)

    null
  }


  /**
    * 平台订单按照车型分布情况
    * @param city
    * @param timestamp
    * @return
    */
  override def getOrderDistribution(city: String, timestamp: Long): AnyRef = {

    null
  }

  /**
    * 平台完成单量top10城市列表以及对应完成单量
    * @param timestamp
    * @return
    */
  override def getTopNOrderByCity(timestamp: Long): AnyRef = {

    null
  }


  /**
    * 供需状态折线图（提供12小时数据）
    * @param city
    * @param timestamp
    * @return
    */
  override def getSupplyDemandStatus(city: String, timestamp: Long): AnyRef = {

    null
  }






}

