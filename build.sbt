import sbt.Keys.name

name := """test-repo"""

version := "0"

packageName in Universal := name.value

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"


resolvers += "RoundEights" at "http://maven.spikemark.net/roundeights"

resolvers += "elasticsearch-releases" at "https://maven.elasticsearch.org/releases"

resolvers ++= Seq(
  "Java.net Maven2 Repository"       at "http://download.java.net/maven/2/",
  "Twitter Repository"               at "http://maven.twttr.com",
  "bintray" at "http://dl.bintray.com/scalaz/releases",
  Resolver.typesafeRepo("releases"),
  Resolver.sonatypeRepo("releases"),
  Resolver.bintrayRepo("websudos", "oss-releases")
)


libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
//  "com.zaxxer" % "HikariCP" % "2.5.1" force(),
//  "com.github.ghik" %% "silencer-lib" % "0.5",
//  "com.opsgenie.integration" % "sdk" % "2.4.0",
//  "org.influxdb" % "influxdb-java" % "2.4",
//  "com.bugsnag" % "bugsnag" % "1.2.8",
//  "com.twitter" %% "finagle-core" % "6.30.0",
//  "com.twitter" %% "finagle-zipkin" % "6.30.0",
//  "io.netty" % "netty" % "3.9.9.Final" force(),
//  "net.codingwell" %% "scala-guice" % "4.0.0",
//  "com.typesafe.play" %% "play-mailer" % "4.0.0",
//  "com.github.tototoshi" %% "play-json-naming" % "1.0.0",
//  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
//  "com.logentries" % "logentries-appender" % "1.1.35",
//  "org.postgresql" % "postgresql" % "9.3-1102-jdbc41",
//  "com.typesafe.play" %% "play-slick" % "1.1.1",
//  "com.github.tminglei" %% "slick-pg" % "0.14.3",
//  "redis.clients" % "jedis" % "2.8.0",
//  "org.redisson" % "redisson" % "3.3.0",
//  "com.google.protobuf" % "protobuf-java" % "2.6.1",
//  "com.typesafe.akka" %% "akka-stream-experimental" % "0.11",
//  "io.spray" %% "spray-can" % "1.3.2",
//  "io.spray" %% "spray-client" % "1.3.2",
//  "io.spray" %% "spray-json" % "1.3.1",
//  "com.amazonaws" % "aws-java-sdk-s3" % "1.11.86",
//  "com.amazonaws" % "aws-java-sdk-core" % "1.11.86",
//  "com.amazonaws" % "aws-java-sdk-dynamodb" % "1.11.86",
//  "com.amazonaws" % "aws-java-sdk-lambda" % "1.11.86",
//  "com.amazonaws" % "aws-java-sdk-kinesis" % "1.11.86",
//  "com.sksamuel.elastic4s" %% "elastic4s-core" % "2.3.1",
//  "org.elasticsearch.plugin" % "shield" % "2.2.0",
//  "com.squareup.okhttp" % "okhttp" % "2.4.0",
//  "com.google.code.gson" % "gson" % "2.3.1",
//  "com.google.guava" % "guava" % "19.0",
//  "com.jayway.jsonpath" % "json-path" % "2.0.0",
//  "org.bouncycastle" % "bcprov-jdk16" % "1.46",
//  "com.roundeights" %% "hasher" % "1.0.0",
//  "io.keen" % "keen-client-api-java" % "2.1.2",
//  "io.prometheus" % "simpleclient" % "0.0.14",
//  "io.prometheus" % "simpleclient_hotspot" % "0.0.14",
//  "io.prometheus" % "simpleclient_common" % "0.0.14",
//  "io.nats" % "jnats" % "0.7.3",
//  "com.websudos" %% "phantom-dsl" % "1.28.11",
//  "com.squareup.okhttp3" % "okhttp" % "3.4.1",
//  "com.netflix.archaius" % "archaius2-core" % "2.1.8",
//  "com.netflix.archaius" % "archaius2-typesafe" % "2.1.8",
//  "com.beachape" %% "enumeratum" % "1.5.4",
//  "com.github.nikita-volkov" % "sext" % "0.2.4" % "test",
//  "org.specs2" %% "specs2-core" % "3.8.5" % "test",
//  "org.specs2" %% "specs2-matcher-extra" % "3.8.5" % "test",
//  "org.specs2" %% "specs2-mock" % "3.8.5" % "test",
//  "org.specs2" %% "specs2-junit" % "3.8.5" % "test",
//  "junit" % "junit" % "4.12" % "test",
//  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test"
)

sources in (Compile,doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false