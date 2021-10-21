package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_16: K8sManifest {
  /** kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use
this value as the `kind` attribute in API calls. */
  @K8sDslMarker var kind: String?
  /** categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API
discovery documents, and used by clients to support invocations like `kubectl get all`. */
  @K8sDslMarker var categories: List<String>?
  /** listKind is the serialized kind of the list for this resource. Defaults to "`kind`List". */
  @K8sDslMarker var listKind: String?
  /** plural is the plural name of the resource to serve. The custom resources are served under
`/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form
`<names.plural>.<group>`). Must be all lowercase. */
  @K8sDslMarker var plural: String?
  /** shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support
invocations like `kubectl get <shortname>`. It must be all lowercase. */
  @K8sDslMarker var shortNames: List<String>?
  /** singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`. */
  @K8sDslMarker var singular: String?
}      
typealias CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_17 = CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_16       
typealias CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_18 = CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_17       
typealias CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_19 = CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_18       
typealias CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_20 = CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_19       
typealias CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_21 = CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_20 