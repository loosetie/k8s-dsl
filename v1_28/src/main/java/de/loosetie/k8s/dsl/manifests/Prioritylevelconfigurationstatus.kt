package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Prioritylevelconfigurationstatus_flowcontrol_apiserver_k8s_io_v1beta3: K8sManifest {
  /** `conditions` is the current state of "request-priority". */
  val conditions: List<PriorityLevelConfigurationCondition_flowcontrol_apiserver_k8s_io_v1beta3>?
}