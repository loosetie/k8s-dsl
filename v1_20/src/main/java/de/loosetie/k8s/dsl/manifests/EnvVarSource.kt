package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EnvVarSource_core_v1_k8s1_20: K8sManifest {
  /** Selects a key of a ConfigMap. */
  val configMapKeyRef: ConfigMapKeySelector_core_v1_k8s1_20?
  /** Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`,
`metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs. */
  val fieldRef: ObjectFieldSelector_core_v1_k8s1_20?
  /** Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory,
limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported. */
  val resourceFieldRef: ResourceFieldSelector_core_v1_k8s1_20?
  /** Selects a key of a secret in the pod's namespace */
  val secretKeyRef: SecretKeySelector_core_v1_k8s1_20?
}