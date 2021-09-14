package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("\$ref", "\$schema", "additionalItems", "additionalProperties", "allOf", "anyOf", "default", "definitions", "dependencies", "description", "enum", "example", "exclusiveMaximum", "exclusiveMinimum", "externalDocs", "format", "id", "items", "maxItems", "maxLength", "maxProperties", "maximum", "minItems", "minLength", "minProperties", "minimum", "multipleOf", "not", "nullable", "oneOf", "pattern", "patternProperties", "properties", "required", "title", "type", "uniqueItems", "x-kubernetes-embedded-resource", "x-kubernetes-int-or-string", "x-kubernetes-list-map-keys", "x-kubernetes-list-type", "x-kubernetes-map-type", "x-kubernetes-preserve-unknown-fields")
class JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_18, HasParent {
  override var `$ref`: String? = null
  override var `$schema`: String? = null
  override var additionalItems: JSONSchemaPropsOrBool_apiextensions_k8s_io_v1_k8s1_18? = null
  override var additionalProperties: JSONSchemaPropsOrBool_apiextensions_k8s_io_v1_k8s1_18? = null
  override var allOf: List<JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_18>? = null
  override var anyOf: List<JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_18>? = null
  override var default: JSON_apiextensions_k8s_io_v1_k8s1_18? = null
  override var definitions: Any? = null
  override var dependencies: Any? = null
  override var description: String? = null
  override var enum: List<JSON_apiextensions_k8s_io_v1_k8s1_18>? = null
  override var example: JSON_apiextensions_k8s_io_v1_k8s1_18? = null
  override var exclusiveMaximum: Boolean? = null
  override var exclusiveMinimum: Boolean? = null
  override var externalDocs: ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_18? = null
  override var format: String? = null
  override var id: String? = null
  override var items: JSONSchemaPropsOrArray_apiextensions_k8s_io_v1_k8s1_18? = null
  override var maxItems: Int? = null
  override var maxLength: Int? = null
  override var maxProperties: Int? = null
  override var maximum: Number? = null
  override var minItems: Int? = null
  override var minLength: Int? = null
  override var minProperties: Int? = null
  override var minimum: Number? = null
  override var multipleOf: Number? = null
  override var not: JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_18? = null
  override var nullable: Boolean? = null
  override var oneOf: List<JSONSchemaProps_apiextensions_k8s_io_v1_k8s1_18>? = null
  override var pattern: String? = null
  override var patternProperties: Any? = null
  override var properties: Any? = null
  override var required: List<String>? = null
  override var title: String? = null
  override var type: String? = null
  override var uniqueItems: Boolean? = null
  override var `x-kubernetes-embedded-resource`: Boolean? = null
  override var `x-kubernetes-int-or-string`: Boolean? = null
  override var `x-kubernetes-list-map-keys`: List<String>? = null
  override var `x-kubernetes-list-type`: String? = null
  override var `x-kubernetes-map-type`: String? = null
  override var `x-kubernetes-preserve-unknown-fields`: Boolean? = null
}