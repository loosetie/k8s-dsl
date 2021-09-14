package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21: K8sManifest {
  /** `type` is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace". Required. */
  @K8sDslMarker var type: String?
}