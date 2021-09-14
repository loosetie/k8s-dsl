package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface CustomResourceSubresources_apiextensions_k8s_io_v1_k8s1_18: K8sManifest {
  /** scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object. */
  val scale: CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_18?
  /** status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom
resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource
`/status` subresource ignore changes to anything other than the `status` stanza of the object. */
  val status: CustomResourceSubresourceStatus_apiextensions_k8s_io_v1_k8s1_18?
}