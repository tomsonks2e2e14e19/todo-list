resolvers += "Flyway" at "https://davidmweber.github.io/flyway-sbt.repo"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.11")

addSbtPlugin("org.flywaydb" % "flyway-sbt" % "4.2.0")