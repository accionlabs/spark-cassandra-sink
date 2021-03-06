useGpg := true

ThisBuild / organizationHomepage := Some(url("https://github.com/bdoepf/spark-cassandra-sink"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/bdoepf/spark-cassandra-sink.git"),
    "git@github.com:bdoepf/spark-cassandra-sink.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "bdoepf",
    name  = "bdoepf",
    email = "",
    url   = url("https://github.com/bdoepf")
  )
)
ThisBuild / description := "spark-cassandra-sink is a Spark Structured Streaming Sink for cassandra. " +
  "It requires a streaming Dataset/Dataframe and inserts its rows into a cassandra table."
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/bdoepf/spark-cassandra-sink"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true