val scala3Version = "3.5.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "http-server",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % "10.5.0",
      "com.typesafe.akka" %% "akka-stream" % "2.8.0",
      "ch.qos.logback" % "logback-classic" % "1.4.11"
    )
  )