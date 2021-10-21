package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Tokenrequeststatus_authentication_k8s_io_v1_k8s1_16: K8sManifest {
  /** ExpirationTimestamp is the time of expiration of the returned token. */
  val expirationTimestamp: Time_meta_v1_k8s1_16?
  /** Token is the opaque bearer token. */
  @K8sDslMarker var token: String?
}      
typealias Tokenrequeststatus_authentication_k8s_io_v1_k8s1_17 = Tokenrequeststatus_authentication_k8s_io_v1_k8s1_16       
typealias Tokenrequeststatus_authentication_k8s_io_v1_k8s1_18 = Tokenrequeststatus_authentication_k8s_io_v1_k8s1_17       
typealias Tokenrequeststatus_authentication_k8s_io_v1_k8s1_19 = Tokenrequeststatus_authentication_k8s_io_v1_k8s1_18       
typealias Tokenrequeststatus_authentication_k8s_io_v1_k8s1_20 = Tokenrequeststatus_authentication_k8s_io_v1_k8s1_19       
typealias Tokenrequeststatus_authentication_k8s_io_v1_k8s1_21 = Tokenrequeststatus_authentication_k8s_io_v1_k8s1_20 