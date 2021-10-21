package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17: K8sManifest {
  /** `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example: -
"/healthz" is legal - "/hea`*`" is illegal - "/hea" is legal but matches nothing - "/hea/`*`" also matches nothing -
"/healthz/`*`" matches all per-component health checks. "`*`" matches all non-resource urls. if it is present, it must
be the only entry. Required. */
  @K8sDslMarker var nonResourceURLs: List<String>?
  /** `verbs` is a list of matching verbs and may not be empty. "`*`" matches all verbs. If it is present, it must be the only
entry. Required. */
  @K8sDslMarker var verbs: List<String>?
}      
typealias NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18 = NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17       
typealias NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19 = NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18       


@K8sDslMarker
interface NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20: K8sManifest {
  /** `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example: -
"/healthz" is legal - "/hea`*`" is illegal - "/hea" is legal but matches nothing - "/hea/`*`" also matches nothing -
"/healthz/`*`" matches all per-component health checks. "`*`" matches all non-resource urls. if it is present, it must
be the only entry. Required. */
  @K8sDslMarker var nonResourceURLs: List<String>?
  /** `verbs` is a list of matching verbs and may not be empty. "`*`" matches all verbs. If it is present, it must be the only
entry. Required. */
  @K8sDslMarker var verbs: List<String>?
}      


typealias NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21 = NonResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20 