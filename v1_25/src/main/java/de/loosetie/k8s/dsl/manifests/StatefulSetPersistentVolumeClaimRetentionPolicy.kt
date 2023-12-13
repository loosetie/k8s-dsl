package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface StatefulSetPersistentVolumeClaimRetentionPolicy_apps_v1: K8sManifest {
  /** WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is
deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy
causes those PVCs to be deleted. */
  @K8sDslMarker var whenDeleted: String?
  /** WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled
down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the
associated PVCs for any excess pods above the replica count to be deleted. */
  @K8sDslMarker var whenScaled: String?
}