package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_16: K8sManifest {
  /** name is a human readable name for the column. */
  @K8sDslMarker var name: String?
  /** description is a human readable description of this column. */
  @K8sDslMarker var description: String?
  /** format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier
column to assist in clients identifying column is the resource name. See
https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details. */
  @K8sDslMarker var format: String?
  /** jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the
value for this column. */
  @K8sDslMarker var jsonPath: String?
  /** priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered
higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0. */
  @K8sDslMarker var priority: Int?
  /** type is an OpenAPI type definition for this column. See
https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details. */
  @K8sDslMarker var type: String?
}      
typealias CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_17 = CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_16       
typealias CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_18 = CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_17       
typealias CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_19 = CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_18       
typealias CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_20 = CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_19       
typealias CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_21 = CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_20 