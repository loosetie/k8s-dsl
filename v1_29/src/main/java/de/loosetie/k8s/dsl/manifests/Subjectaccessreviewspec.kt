package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Subjectaccessreviewspec_authorization_k8s_io_v1: K8sManifest {
  /** Extra corresponds to the user.Info.GetExtra() method from the authenticator. Since that is input to the authorizer it
needs a reflection here. */
  @K8sDslMarker var extra: Any?
  /** Groups is the groups you're testing for. */
  @K8sDslMarker var groups: List<String>?
  /** NonResourceAttributes describes information for a non-resource access request */
  val nonResourceAttributes: NonResourceAttributes_authorization_k8s_io_v1?
  /** ResourceAuthorizationAttributes describes information for a resource access request */
  val resourceAttributes: ResourceAttributes_authorization_k8s_io_v1?
  /** UID information about the requesting user. */
  @K8sDslMarker var uid: String?
  /** User is the user you're testing for. If you specify "User" but not "Groups", then is it interpreted as "What if User
were not a member of any groups */
  @K8sDslMarker var user: String?
}