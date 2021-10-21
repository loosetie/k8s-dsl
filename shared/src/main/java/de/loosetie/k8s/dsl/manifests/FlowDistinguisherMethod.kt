package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17: K8sManifest {
  /** `type` is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace". Required. */
  @K8sDslMarker var type: String?
}      
typealias FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18 = FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_17       
typealias FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19 = FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_18       


@K8sDslMarker
interface FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20: K8sManifest {
  /** `type` is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace". Required. */
  @K8sDslMarker var type: String?
}      


typealias FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_21 = FlowDistinguisherMethod_flowcontrol_apiserver_k8s_io_v1beta1_k8s1_20 