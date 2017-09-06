name := "testCase"

version := "0.1"

scalaVersion := "2.12.3"

val http4sVersion = "0.17.0-RC1"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4")


// Only necessary for SNAPSHOT releases
resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-dsl" % http4sVersion exclude("org.typelevel", "scala-library"),
  "org.http4s" %% "http4s-blaze-server" % http4sVersion exclude("org.typelevel", "scala-library"),
  "org.http4s" %% "http4s-blaze-client" % http4sVersion exclude("org.typelevel", "scala-library"),
  "org.http4s" %% "http4s-circe" % http4sVersion exclude("org.typelevel", "scala-library"),
  "org.http4s" %% "rho-swagger" % http4sVersion,
  "io.circe" %% "circe-generic" % "0.8.0",
  "io.circe" %% "circe-optics" % "0.8.0",
  "io.circe" %% "circe-parser" % "0.8.0",
  "io.circe" %% "circe-literal" % "0.8.0",
  "io.swagger" % "swagger-models" % "1.5.10",
  "io.swagger" % "swagger-core" % "1.5.10"
)
