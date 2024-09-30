ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.4"

lazy val root = (project in file("."))
  .settings(
    name := "cats-exercises"
  )

libraryDependencies +=
  "org.typelevel" %% "cats-core" % "2.12.0"

scalacOptions ++= Seq(
  "-Xfatal-warnings",
)