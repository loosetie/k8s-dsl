package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("pathPrefix", "readOnly")
open class AllowedHostPath_policy_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: AllowedHostPath_policy_v1beta1, HasParent {
  override var pathPrefix: String? = null
  override var readOnly: Boolean? = null
}