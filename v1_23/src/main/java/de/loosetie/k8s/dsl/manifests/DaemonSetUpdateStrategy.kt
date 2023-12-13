package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface DaemonSetUpdateStrategy_apps_v1: K8sManifest {
  /** Rolling update config params. Present only if type = "RollingUpdate". */
  val rollingUpdate: Rollingupdatedaemonset_apps_v1?
  /** Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate. Possible enum values: -
`"OnDelete"` Replace the old daemons only when it's killed - `"RollingUpdate"` Replace the old daemons by new ones using
rolling update i.e replace them on each node one after the other. */
  @K8sDslMarker var type: String?
}