package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface CertificateSigningRequest_certificates_k8s_io_v1: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "certificates.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "CertificateSigningRequest"
  /**  */
  val metadata: ObjectMeta_meta_v1
  /** spec contains the certificate request, and is immutable after creation. Only the request, signerName, expirationSeconds,
and usages fields can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users. */
  val spec: Certificatesigningrequestspec_certificates_k8s_io_v1
  /** status contains information about whether the request is approved or denied, and the certificate issued by the signer,
or the failure condition indicating signer failure. */
  val status: Certificatesigningrequeststatus_certificates_k8s_io_v1?
}