name := """case-10872"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

// routesGenerator := InjectedRoutesGenerator

libraryDependencies += guice
