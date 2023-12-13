package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ManagedFieldsEntry_meta_v1: K8sManifest {
  /** APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like
the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically
converted. */
  @K8sDslMarker var apiVersion: String?
  /** FieldsType is the discriminator for the different fields format and version. There is currently only one possible value:
"FieldsV1" */
  @K8sDslMarker var fieldsType: String?
  /** FieldsV1 holds the first JSON version format as described in the "FieldsV1" type. */
  val fieldsV1: FieldsV1_meta_v1?
  /** Manager is an identifier of the workflow managing these fields. */
  @K8sDslMarker var manager: String?
  /** Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this
field are 'Apply' and 'Update'. */
  @K8sDslMarker var operation: String?
  /** Subresource is the name of the subresource used to update that object, or empty string if the object was updated through
the main resource. The value of this field is used to distinguish between managers, even if they share the same name.
For example, a status update will be distinct from a regular update using the same manager name. Note that the
APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource. */
  @K8sDslMarker var subresource: String?
  /** Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply' */
  val time: Time_meta_v1?
}