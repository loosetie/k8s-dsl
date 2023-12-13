package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface GRPCAction_core_v1: K8sManifest {
  /** Port number of the gRPC service. Number must be in the range 1 to 65535. */
  @K8sDslMarker var port: Int?
  /** Service is the name of the service to place in the gRPC HealthCheckRequest (see
https://github.com/grpc/grpc/blob/master/doc/health-checking.md). If this is not specified, the default behavior is
defined by gRPC. */
  @K8sDslMarker var service: String?
}