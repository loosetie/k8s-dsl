package de.loosetie.k8s.dsl

interface K8sTopLevel : K8sManifest {
  val apiVersion: String
  val kind: String
}

interface HasMetadata {
}

interface K8sManifest {

}

interface HasParent {
  val parent: K8sManifest?
}