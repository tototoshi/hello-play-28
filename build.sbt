lazy val `hello-play-27` = project
  .in(file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "hello-play-28",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.13.5",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatest" %% "scalatest" % "3.2.6" % "test"
    )
  )
