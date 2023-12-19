package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ClusterTrustBundleProjection_core_v1: K8sManifest {
  /** Select a single ClusterTrustBundle by object name. Mutually-exclusive with signerName and labelSelector. */
  @K8sDslMarker var name: String?
  /** Select all ClusterTrustBundles that match this label selector. Only has effect if signerName is set. Mutually-exclusive
with name. If unset, interpreted as "match nothing". If set but empty, interpreted as "match everything". */
  val labelSelector: LabelSelector_meta_v1?
  /** If true, don't block pod startup if the referenced ClusterTrustBundle(s) aren't available. If using name, then the named
ClusterTrustBundle is allowed not to exist. If using signerName, then the combination of signerName and labelSelector is
allowed to match zero ClusterTrustBundles. */
  @K8sDslMarker var optional: Boolean?
  /** Relative path from the volume root to write the bundle. */
  @K8sDslMarker var path: String?
  /** Select all ClusterTrustBundles that match this signer name. Mutually-exclusive with name. The contents of all selected
ClusterTrustBundles will be unified and deduplicated. */
  @K8sDslMarker var signerName: String?
}