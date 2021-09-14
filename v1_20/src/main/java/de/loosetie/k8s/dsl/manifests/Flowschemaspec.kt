package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Flowschemaspec_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20: K8sManifest {
  /** `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies
that the distinguisher is disabled and thus will always be the empty string. */
  val distinguisherMethod: FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20?
  /** `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among
those with the numerically lowest (which we take to be logically highest) MatchingPrecedence. Each MatchingPrecedence
value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default. */
  @K8sDslMarker var matchingPrecedence: Int?
  /** `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be
resolved, the FlowSchema will be ignored and marked as invalid in its status. Required. */
  val priorityLevelConfiguration: PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20?
  /** `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least
one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema. */
  val rules: List<PolicyRulesWithSubjects_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20>?
}