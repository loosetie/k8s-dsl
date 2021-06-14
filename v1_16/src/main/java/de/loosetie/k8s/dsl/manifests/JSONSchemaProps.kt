package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface JSONSchemaProps_apiextensions_k8s_io_v1: K8sManifest {
  /**  */
  @K8sDslMarker var `$ref`: String?
  /**  */
  @K8sDslMarker var `$schema`: String?
  /**  */
  val additionalItems: JSONSchemaPropsOrBool_apiextensions_k8s_io_v1?
  /**  */
  val additionalProperties: JSONSchemaPropsOrBool_apiextensions_k8s_io_v1?
  /**  */
  val allOf: List<JSONSchemaProps_apiextensions_k8s_io_v1>?
  /**  */
  val anyOf: List<JSONSchemaProps_apiextensions_k8s_io_v1>?
  /** default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting
feature gate. Defaulting requires spec.preserveUnknownFields to be false. */
  val default: JSON_apiextensions_k8s_io_v1?
  /**  */
  @K8sDslMarker var definitions: Any?
  /**  */
  @K8sDslMarker var dependencies: Any?
  /**  */
  @K8sDslMarker var description: String?
  /**  */
  val enum: List<JSON_apiextensions_k8s_io_v1>?
  /**  */
  val example: JSON_apiextensions_k8s_io_v1?
  /**  */
  @K8sDslMarker var exclusiveMaximum: Boolean?
  /**  */
  @K8sDslMarker var exclusiveMinimum: Boolean?
  /**  */
  val externalDocs: ExternalDocumentation_apiextensions_k8s_io_v1?
  /**  */
  @K8sDslMarker var format: String?
  /**  */
  @K8sDslMarker var id: String?
  /**  */
  val items: JSONSchemaPropsOrArray_apiextensions_k8s_io_v1?
  /**  */
  @K8sDslMarker var maxItems: Int?
  /**  */
  @K8sDslMarker var maxLength: Int?
  /**  */
  @K8sDslMarker var maxProperties: Int?
  /**  */
  @K8sDslMarker var maximum: Number?
  /**  */
  @K8sDslMarker var minItems: Int?
  /**  */
  @K8sDslMarker var minLength: Int?
  /**  */
  @K8sDslMarker var minProperties: Int?
  /**  */
  @K8sDslMarker var minimum: Number?
  /**  */
  @K8sDslMarker var multipleOf: Number?
  /**  */
  val not: JSONSchemaProps_apiextensions_k8s_io_v1?
  /**  */
  @K8sDslMarker var nullable: Boolean?
  /**  */
  val oneOf: List<JSONSchemaProps_apiextensions_k8s_io_v1>?
  /**  */
  @K8sDslMarker var pattern: String?
  /**  */
  @K8sDslMarker var patternProperties: Any?
  /**  */
  @K8sDslMarker var properties: Any?
  /**  */
  @K8sDslMarker var required: List<String>?
  /**  */
  @K8sDslMarker var title: String?
  /**  */
  @K8sDslMarker var type: String?
  /**  */
  @K8sDslMarker var uniqueItems: Boolean?
  /** x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and
ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and
metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to
be if the object is fully specified (up to kind, apiVersion, metadata). */
  @K8sDslMarker var `x-kubernetes-embedded-resource`: Boolean?
  /** x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is
allowed and type as child of anyOf is permitted if following one of the following patterns: 1) anyOf: - type: integer -
type: string 2) allOf: - anyOf: - type: integer - type: string - ... zero or more */
  @K8sDslMarker var `x-kubernetes-int-or-string`: Boolean?
  /** x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the
index of the map. This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to "map".
Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is
supported). */
  @K8sDslMarker var `x-kubernetes-list-map-keys`: List<String>?
  /** x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists
and may have 3 possible values: 1) `atomic`: the list is treated as a single entity, like a scalar. Atomic lists will be
entirely replaced when updated. This extension may be used on any type of list (struct, scalar, ...). 2) `set`: Sets are
lists that must not have multiple items with the same value. Each value must be a scalar (or another atomic type). 3)
`map`: These lists are like maps in that their elements have a non-index key used to identify them. Order is preserved
upon merge. The map tag must only be used on a list with elements of type object. Defaults to atomic for arrays. */
  @K8sDslMarker var `x-kubernetes-list-type`: String?
  /** x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in
the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested
properties or additionalProperties are specified in the schema. This can either be true or undefined. False is
forbidden. */
  @K8sDslMarker var `x-kubernetes-preserve-unknown-fields`: Boolean?
}