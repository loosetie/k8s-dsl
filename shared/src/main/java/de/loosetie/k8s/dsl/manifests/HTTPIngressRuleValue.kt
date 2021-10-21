package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_16: K8sManifest {
  /** A collection of paths that map requests to backends. */
  val paths: List<HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_16>?
}      
typealias HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_17 = HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_16       
typealias HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_18 = HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_17       
@K8sDslMarker
interface HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_19: K8sManifest {
  /** A collection of paths that map requests to backends. */
  val paths: List<HTTPIngressPath_networking_k8s_io_v1_k8s1_19>?
}

      
typealias HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_20 = HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_19 

      
typealias HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_21 = HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_20 

