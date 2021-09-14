package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface GroupSubject_flowcontrol_apiserver_k8s_io_v1alpha1_k8s1_19: K8sManifest {
  /** name is the user group that matches, or "`*`" to match all user groups. See
https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names.
Required. */
  @K8sDslMarker var name: String?
}