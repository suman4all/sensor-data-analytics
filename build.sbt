//import Dependencies._

name := "sensor-data-analytics"

ThisBuild / version := "1.0.0"
ThisBuild / scalaVersion := "2.12.12"
ThisBuild / organization := "com.org"
ThisBuild / organizationName := "Sample Organization"
ThisBuild / useCoursier := false

//scalacOptions := Seq("-unchecked", "-deprecation", "-Yrangepos", "-Ywarn-unused-import")
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.2.1" % "provided"
libraryDependencies += "com.amazonaws" % "aws-java-sdk-core" % "1.11.946"
libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.11.946"
libraryDependencies += "com.typesafe" % "config" % "1.4.1"
libraryDependencies += "io.delta" %% "delta-core" % "1.0.0"
libraryDependencies += "io.spray" %%  "spray-json" % "1.3.6"

libraryDependencies += "com.audienceproject" %% "simple-arguments" % "1.0.1"