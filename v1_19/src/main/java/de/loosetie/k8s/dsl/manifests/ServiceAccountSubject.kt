package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ServiceAccountSubject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19: K8sManifest {
  /** `namespace` is the namespace of matching ServiceAccount objects. Required. */
  @K8sDslMarker var namespace: String?
  /** `name` is the name of matching ServiceAccount objects, or "`*`" to match regardless of name. Required. */
  @K8sDslMarker var name: String?
}