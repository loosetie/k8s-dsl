package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface IngressPortStatus_networking_k8s_io_v1: K8sManifest {
  /** Error is to record the problem with the service port The format of the error shall comply with the following rules: -
built-in error values shall be specified in this file and those shall use CamelCase names - cloud provider specific
error values must have names that comply with the format foo.example.com/CamelCase. */
  @K8sDslMarker var error: String?
  /** Port is the port number of the ingress port. */
  @K8sDslMarker var port: Int?
  /** Protocol is the protocol of the ingress port. The supported values are: "TCP", "UDP", "SCTP" */
  @K8sDslMarker var protocol: String?
}