package com.org
import org.apache.spark.sql.{DataFrame, SparkSession}

package object analytics {

  implicit val spark: SparkSession = {
    if (System.getenv("ENV") == "local")
      SparkSession.builder.master("local")
    else
      SparkSession.builder
  }
    .appName("Sensor Data Analytics")
    .config("spark.sql.sources.partitionColumnTypeInference.enabled", "false")
    .getOrCreate()

}
