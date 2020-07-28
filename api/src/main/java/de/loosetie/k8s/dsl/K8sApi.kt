package de.loosetie.k8s.dsl

@K8sDslMarker
open class K8sApi {
  val manifests = mutableListOf<K8sTopLevel>()
}

/** This is the centra entry point for the DSL */
fun k8sApi(init: K8sApi.() -> Unit): List<K8sTopLevel> =
  K8sApi().also(init).manifests
