package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ServiceReference_admissionregistration_k8s_io_v1_k8s1_16: K8sManifest {
  /** `namespace` is the namespace of the service. Required */
  @K8sDslMarker var namespace: String?
  /** `name` is the name of the service. Required */
  @K8sDslMarker var name: String?
  /** `path` is an optional URL path which will be sent in any request to this service. */
  @K8sDslMarker var path: String?
  /** If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be
a valid port number (1-65535, inclusive). */
  @K8sDslMarker var port: Int?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface ServiceReference_apiextensions_k8s_io_v1_k8s1_16: K8sManifest {
  /** namespace is the namespace of the service. Required */
  @K8sDslMarker var namespace: String?
  /** name is the name of the service. Required */
  @K8sDslMarker var name: String?
  /** path is an optional URL path at which the webhook will be contacted. */
  @K8sDslMarker var path: String?
  /** port is an optional service port at which the webhook will be contacted. `port` should be a valid port number (1-65535,
inclusive). Defaults to 443 for backward compatibility. */
  @K8sDslMarker var port: Int?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface ServiceReference_apiregistration_k8s_io_v1_k8s1_16: K8sManifest {
  /** Namespace is the namespace of the service */
  @K8sDslMarker var namespace: String?
  /** Name is the name of the service */
  @K8sDslMarker var name: String?
  /** If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be
a valid port number (1-65535, inclusive). */
  @K8sDslMarker var port: Int?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_16: K8sManifest {
  /** `namespace` is the namespace of the service. Required */
  @K8sDslMarker var namespace: String?
  /** `name` is the name of the service. Required */
  @K8sDslMarker var name: String?
  /** `path` is an optional URL path which will be sent in any request to this service. */
  @K8sDslMarker var path: String?
  /** If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be
a valid port number (1-65535, inclusive). */
  @K8sDslMarker var port: Int?
}      
typealias ServiceReference_admissionregistration_k8s_io_v1_k8s1_17 = ServiceReference_admissionregistration_k8s_io_v1_k8s1_16 

typealias ServiceReference_apiextensions_k8s_io_v1_k8s1_17 = ServiceReference_apiextensions_k8s_io_v1_k8s1_16 

typealias ServiceReference_apiregistration_k8s_io_v1_k8s1_17 = ServiceReference_apiregistration_k8s_io_v1_k8s1_16 

typealias ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_17 = ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_16       
typealias ServiceReference_admissionregistration_k8s_io_v1_k8s1_18 = ServiceReference_admissionregistration_k8s_io_v1_k8s1_17 

typealias ServiceReference_apiextensions_k8s_io_v1_k8s1_18 = ServiceReference_apiextensions_k8s_io_v1_k8s1_17 

typealias ServiceReference_apiregistration_k8s_io_v1_k8s1_18 = ServiceReference_apiregistration_k8s_io_v1_k8s1_17 

typealias ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_18 = ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_17       
typealias ServiceReference_admissionregistration_k8s_io_v1_k8s1_19 = ServiceReference_admissionregistration_k8s_io_v1_k8s1_18 

typealias ServiceReference_apiextensions_k8s_io_v1_k8s1_19 = ServiceReference_apiextensions_k8s_io_v1_k8s1_18 

typealias ServiceReference_apiregistration_k8s_io_v1_k8s1_19 = ServiceReference_apiregistration_k8s_io_v1_k8s1_18       
typealias ServiceReference_admissionregistration_k8s_io_v1_k8s1_20 = ServiceReference_admissionregistration_k8s_io_v1_k8s1_19 

typealias ServiceReference_apiextensions_k8s_io_v1_k8s1_20 = ServiceReference_apiextensions_k8s_io_v1_k8s1_19 

typealias ServiceReference_apiregistration_k8s_io_v1_k8s1_20 = ServiceReference_apiregistration_k8s_io_v1_k8s1_19       
typealias ServiceReference_admissionregistration_k8s_io_v1_k8s1_21 = ServiceReference_admissionregistration_k8s_io_v1_k8s1_20 

typealias ServiceReference_apiextensions_k8s_io_v1_k8s1_21 = ServiceReference_apiextensions_k8s_io_v1_k8s1_20 

typealias ServiceReference_apiregistration_k8s_io_v1_k8s1_21 = ServiceReference_apiregistration_k8s_io_v1_k8s1_20 