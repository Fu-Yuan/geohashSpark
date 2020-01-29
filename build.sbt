name := "GeohashPipeLine"

version := "0.1"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4"
libraryDependencies += "com.typesafe" % "config" % "1.4.0"
libraryDependencies += "ch.hsr" % "geohash" % "1.3.0"

scalaVersion := "2.11.12"
