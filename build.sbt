import play.PlayJava
import play.PlayImport._
name := """text3"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  filters,
  javaJdbc,
  javaEbean,
  cache,
  javaWs
  , json
  , "org.apache.directory.studio" % "org.apache.commons.io" % "2.4"
  , "mysql" % "mysql-connector-java" % "5.1.18"
  , "org.webjars" % "requirejs" % "2.1.11-1"
  , "com.google.inject" % "guice" % "3.0"
  , "org.jasypt" % "jasypt" % "1.9.2"
  , javaJpa
  //, "org.eclipse.persistence" % "eclipselink" % "2.5.1"
//--  , "org.eclipse.persistence" % "eclipselink" % "2.6.0"
  //, "com.typesafe.play.plugins" %% "play-plugins-mailer" % "2.3.1" // Para envío de correos
  // , "com.google.zxing" % "zxing-parent" % "3.1.0" //para generar códigos QR
  //, "org.apache.poi" % "poi" % "3.10.1" // para trabajo con archivos de excel //http://maven-repository.com/artifact/org.apache.poi/poi-examples/3.10.1
  //, "org.apache.poi" % "poi-scratchpad" % "3.10.1"
  //, "org.apache.poi" % "poi-ooxml" % "3.10.1"
  //, "org.apache.poi" % "poi-ooxml-schemas" % "3.10.1"
  //, "com.healthmarketscience.jackcess" % "jackcess" % "2.0.0"
  //, "com.lowagie" % "itext" % "2.1.7"
  //, "net.sf.jasperreports" % "jasperreports" % "6.0.3"
  //, "com.edulify" %% "play-hikaricp" % "2.0.1" // para el pool de conexiones migrando a hikari en vez de bonecp
)
