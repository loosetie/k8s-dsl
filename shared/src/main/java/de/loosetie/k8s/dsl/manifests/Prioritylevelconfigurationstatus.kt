package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17: K8sManifest {
  /** `conditions` is the current state of "request-priority". */
  val conditions: List<PriorityLevelConfigurationCondition_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17>?
}      
typealias Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18 = Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17       
typealias Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19 = Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18       


@K8sDslMarker
interface Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20: K8sManifest {
  /** `conditions` is the current state of "request-priority". */
  val conditions: List<PriorityLevelConfigurationCondition_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20>?
}      


typealias Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21 = Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20 