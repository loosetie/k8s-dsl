package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_16: K8sManifest {
  /** labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only
JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work
with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct)
which contains a serialized label selector in string form. More info:
https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If
there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource
will default to the empty string. */
  @K8sDslMarker var labelSelectorPath: String?
  /** specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON
paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given
path in the custom resource, the `/scale` subresource will return an error on GET. */
  @K8sDslMarker var specReplicasPath: String?
  /** statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only
JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the
given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0. */
  @K8sDslMarker var statusReplicasPath: String?
}      
typealias CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_17 = CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_16       
typealias CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_18 = CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_17       
typealias CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_19 = CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_18       
typealias CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_20 = CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_19       
typealias CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_21 = CustomResourceSubresourceScale_apiextensions_k8s_io_v1_k8s1_20 