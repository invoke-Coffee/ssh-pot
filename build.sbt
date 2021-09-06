
// Dependencies
val scalaactic = "org.scalactic" %% "scalactic" % "3.2.9"
val scalaTest = "org.scalatest" %% "scalatest" % "3.2.9" % "test"
val akkaCore = "com.typesafe.akka" %% "akka-http-core" % "10.2.6"
val akkaActor = "com.typesafe.akka" %% "akka-actor" % "2.4.12"
val liftJson = "net.liftweb" %% "lift-json" % "3.4.3"


ThisBuild / scalaVersion := "2.12.14"
ThisBuild / organization := "coffee.invoke"
ThisBuild / version := "1.0"

lazy val root = (project in file("."))
    .settings(
        name := "sshPot",



    libraryDependencies += scalaactic,
    libraryDependencies += scalaTest,
    libraryDependencies += akkaCore,
    libraryDependencies += akkaActor,
    libraryDependencies += liftJson
    )