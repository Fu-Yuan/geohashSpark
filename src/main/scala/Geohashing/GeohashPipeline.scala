package Geohashing

import org.apache.spark.sql.SparkSession
import com.typesafe.config.{Config,ConfigFactory}



object GeohashPipeline extends App{
println(Runtime.getRuntime.totalMemory()/ (1000 * 1000))
  val sparkSession = new SparkSession.Builder()
    .config("spark.master", "local")
    .config("spark.driver.memory", "1g")
    .appName("GeohashPipeLine")
    .getOrCreate()

  import sparkSession.implicits._
   val conf = ConfigFactory.load("application.conf")

  val url = conf.getString("yellow_cab_trip")
  println(url)
  val content = scala.io.Source.fromURL(url).mkString
//
//  val list = content.split("\n").filter(_ != "")
//
//  val taxtiDF = sparkSession.sparkContext.parallelize(list).toDF()
//  taxtiDF.show(10)
  println(Runtime.getRuntime().freeMemory() / (1000 * 1000))
}
