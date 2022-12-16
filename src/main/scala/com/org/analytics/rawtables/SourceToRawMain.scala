package com.org.analytics.rawtables

import org.apache.log4j.Logger
import com.audienceproject.util.cli.Arguments
import org.apache.spark.sql.SaveMode
import org.apache.spark.sql.functions.{col, format_string, lit, when}

import com.org.analytics.spark

object SourceToRawMain {

  val logger: Logger = Logger.getLogger(getClass.getName)
  def main(implicit args: Array[String]): Unit = {
    import spark.implicits._

    logger.info("Generating Sensor Data Statistics")

    val arguments: Arguments = new Arguments
    val inputBasePath = arguments.getOption("inputBasePath").get






  }

}
