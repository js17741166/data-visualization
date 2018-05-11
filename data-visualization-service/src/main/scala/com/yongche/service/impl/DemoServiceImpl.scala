package com.yongche.service.impl

import java.util

import com.alibaba.dubbo.config.annotation.Service
import com.yongche.data.visualization.mapper.AccountMapper
import com.yongche.domain.Account
import com.yongche.service.DemoService
import org.springframework.beans.factory.annotation.Autowired

@Service
class DemoServiceImpl @Autowired()(private var accountMapper:AccountMapper) extends AnyRef with DemoService  {

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

//  lazy  val KUDU_MASTER ="cdh1.car.bj2.yongche.com:7051,cdh2.car.bj2.yongche.com:7051,cdh3.car.bj2.yongche.com:7051"

  override def getAccounts(startId: Long, endId: Long): util.List[Account] = {
//    val sql = "select kudu_id,account_id,user_id from k_yc_account.account limit 10"
    /*val kuduClient:KuduClient = new KuduClient.KuduClientBuilder(KUDU_MASTER).build()
    val kuduTable:KuduTable = kuduClient.openTable("impala::k_yc_account.account")
    val projectColumns:util.List[String]= new util.ArrayList[String](1)
    projectColumns.add("kudu_id")
    val kuduScanner:KuduScanner =kuduClient.newScannerBuilder(kuduTable).setProjectedColumnNames(projectColumns).limit(10).build()
    import org.apache.kudu.client.RowResult
    import org.apache.kudu.client.RowResultIterator
    kuduClient.openTable("").
    while ( {
      kuduScanner.hasMoreRows
    }) {
      val results = kuduScanner.nextRows
      while ( {
        results.hasNext
      }) {
        val result = results.next
        System.out.println(result.getString(0))
      }
    }*/
//    val df = spark

  /*  println(CONNECTION_URL)
    println(stmt)
    println(stmt.getConnection)
    println(stmt.execute(sql))*/
//    client.execute(sql)
//    val cursor=client.queryList(sql)
//    cursor.foreach{row: Seq[ImpalaValue] =>
//    }
//
//
//    cursor.close

    val accouts:util.List[Account] = accountMapper.getAccount
    println(accouts.toString)
    println("success")
    null
  }

//  def executeQuery(sql:String): ResultSet= {
//    val rs = stmt.executeQuery(sql);
//
//    rs
//  }
}

