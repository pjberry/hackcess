import sbt._
import sbt.Keys._

object HackcessBuild extends Build {

  lazy val hackcess = Project(
    id = "hackcess",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Hackcess",
      organization := "com.bitmotif",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0"
      // add other settings here
    )
  )
}
