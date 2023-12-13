package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface AllocationResult_resource_k8s_io_v1alpha1: K8sManifest {
  /** This field will get set by the resource driver after it has allocated the resource driver to inform the scheduler where
it can schedule Pods using the ResourceClaim. Setting this field is optional. If null, the resource is available
everywhere. */
  val availableOnNodes: NodeSelector_core_v1?
  /** ResourceHandle contains arbitrary data returned by the driver after a successful allocation. This is opaque for
Kubernetes. Driver documentation may explain to users how to interpret this data if needed. The maximum size of this
field is 16KiB. This may get increased in the future, but not reduced. */
  @K8sDslMarker var resourceHandle: String?
  /** Shareable determines whether the resource supports more than one consumer at a time. */
  @K8sDslMarker var shareable: Boolean?
}