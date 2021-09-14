package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_18: K8sManifest {
  /** name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at
`/apis/<group>/<version>/...` if `served` is true. */
  @K8sDslMarker var name: String?
  /** additionalPrinterColumns specifies additional columns returned in Table output. See
https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns
are specified, a single column displaying the age of the custom resource is used. */
  val additionalPrinterColumns: List<CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_18>?
  /** schema describes the schema used for validation, pruning, and defaulting of this version of the custom resource. */
  val schema: CustomResourceValidation_apiextensions_k8s_io_v1_k8s1_18?
  /** served is a flag enabling/disabling this version from being served via REST APIs */
  @K8sDslMarker var served: Boolean?
  /** storage indicates this version should be used when persisting custom resources to storage. There must be exactly one
version with storage=true. */
  @K8sDslMarker var storage: Boolean?
  /** subresources specify what subresources this version of the defined custom resource have. */
  val subresources: CustomResourceSubresources_apiextensions_k8s_io_v1_k8s1_18?
}