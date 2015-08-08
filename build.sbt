import play.PlayJava
import sbt.Keys._

name := "play-authenticate-usage"

scalaVersion := "2.11.2"

version := "1.0-SNAPSHOT"

val appDependencies = Seq(
  "be.objectify"  %% "deadbolt-java"     % "2.3.2",
  // Comment the next line for local development of the Play Authentication core:
  "com.feth"      %% "play-authenticate" % "0.6.8",
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
  "mysql" % "mysql-connector-java" % "5.1.18",
  javaCore,
  cache,
  javaWs,
  javaJdbc,
  javaEbean,
  "org.jacoco" % "org.jacoco.core" % "0.6.4.201312101107" artifacts(Artifact("org.jacoco.core", "jar", "jar")),
  "org.jacoco" % "org.jacoco.report" % "0.6.4.201312101107" artifacts(Artifact("org.jacoco.report", "jar", "jar")),
  "org.webjars" %% "webjars-play" % "2.3.0",
  "org.webjars" % "bootstrap" % "3.2.0",
  "org.webjars" % "datatables" % "1.10.7",
  "org.webjars" % "datatables-plugins" % "ca6ec50",
  "org.webjars" % "jquery" % "2.1.4",
  "org.webjars" % "jquery-ui" % "1.11.4",
  "org.webjars" % "jquery-ui-themes" % "1.11.4",
  "org.webjars.bower" % "adminlte" % "2.2.0"
)

//  Uncomment the next line for local development of the Play Authenticate core:
//lazy val playAuthenticate = project.in(file("modules/play-authenticate")).enablePlugins(PlayJava)

lazy val root = project.in(file("."))
  .enablePlugins(PlayJava)
  .settings(
    libraryDependencies ++= appDependencies
  )
/* Uncomment the next lines for local development of the Play Authenticate core: */
//.dependsOn(playAuthenticate)
//.aggregate(playAuthenticate)
