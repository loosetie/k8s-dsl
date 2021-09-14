package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface CustomResourceValidation_apiextensions_k8s_io_v1_k8s1_18: K8sManifest {
  /** openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning. */
  val openAPIV3Schema: JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_18?
}