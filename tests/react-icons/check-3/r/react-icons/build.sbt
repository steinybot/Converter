organization := "org.scalablytyped"
name := "react-icons"
version := "2.2-89f342"
scalaVersion := "3.3.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "react" % "0.0-unknown-c5a0c8",
  "org.scalablytyped" %%% "react-icon-base" % "2.1-5d0d74",
  "org.scalablytyped" %%% "std" % "0.0-unknown-5f0042")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
