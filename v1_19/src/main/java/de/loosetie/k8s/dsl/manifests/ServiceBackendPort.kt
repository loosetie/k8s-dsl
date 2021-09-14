package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ServiceBackendPort_networking_k8s_io_v1_k8s1_19: K8sManifest {
  /** Name is the name of the port on the Service. This is a mutually exclusive setting with "Number". */
  @K8sDslMarker var name: String?
  /** Number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with "Name". */
  @K8sDslMarker var number: Int?
}