package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1: K8sManifest {
  /** `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the
target non-resource URL. */
  val nonResourceRules: List<NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1>?
  /** `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target
resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty. */
  val resourceRules: List<ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1>?
  /** subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one
member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches
every request. Required. */
  val subjects: List<Subject_flowcontrol_apiserver_k8s_io_v1>?
}