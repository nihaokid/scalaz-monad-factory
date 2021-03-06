scalaVersion := "2.11.6"

organization := "com.thoughtworks"

name := "scalaz-monad-factory"

version := "0.1.0-SNAPSHOT"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.1"

libraryDependencies += "org.scalaz" %% "scalaz-effect" % "7.1.1"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
