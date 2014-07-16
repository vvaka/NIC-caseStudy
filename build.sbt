import play.Project._

name := "ume"

version := "1.0"

scalaVersion := "2.11.1"

playScalaSettings

// Dependencies
libraryDependencies ++= Seq(
  filters,
  cache,
  // WebJars (i.e. client-side) dependencies
  "org.webjars" % "requirejs" % "2.1.11-1",
  "org.webjars" % "lodash" % "2.4.1-4",
  "org.webjars" % "jquery" % "1.11.1",
  "org.webjars" % "bootstrap" % "3.1.1-1" exclude("org.webjars", "jquery"),
  "org.webjars" % "angularjs" % "1.2.19" exclude("org.webjars", "jquery")
)