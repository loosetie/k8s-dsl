package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17: K8sManifest {
  /** `name` is the name of the priority level configuration being referenced Required. */
  @K8sDslMarker var name: String?
}      
typealias PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18 = PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17       
typealias PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19 = PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18       
@K8sDslMarker
interface PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20: K8sManifest {
  /** `name` is the name of the priority level configuration being referenced Required. */
  @K8sDslMarker var name: String?
}      
typealias PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21 = PriorityLevelConfigurationReference_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20 