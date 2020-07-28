package de.loosetie.k8s.dsl.types

interface MapDelegate<T> {
  val map: Map<String, T>
}