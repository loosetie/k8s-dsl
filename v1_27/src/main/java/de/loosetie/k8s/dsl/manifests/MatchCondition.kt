package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface MatchCondition_admissionregistration_k8s_io_v1: K8sManifest {
  /** Name is an identifier for this match condition, used for strategic merging of MatchConditions, as well as providing an
identifier for logging purposes. A good name should be descriptive of the associated expression. Name must be a
qualified name consisting of alphanumeric characters, '-', '_' or '.', and must start and end with an alphanumeric
character (e.g. 'MyName', or 'my.name', or '123-abc', regex used for validation is
'([A-Za-z0-9][-A-Za-z0-9_.]`*`)?[A-Za-z0-9]') with an optional DNS subdomain prefix and '/' (e.g. 'example.com/MyName')
Required. */
  @K8sDslMarker var name: String?
  /** Expression represents the expression which will be evaluated by CEL. Must evaluate to bool. CEL expressions have access
to the contents of the AdmissionRequest and Authorizer, organized into CEL variables: 'object' - The object from the
incoming request. The value is null for DELETE requests. 'oldObject' - The existing object. The value is null for CREATE
requests. 'request' - Attributes of the admission request(/pkg/apis/admission/types.go#AdmissionRequest). 'authorizer' -
A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the
request. See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz 'authorizer.requestResource' - A CEL
ResourceCheck constructed from the 'authorizer' and configured with the request resource. Documentation on CEL:
https://kubernetes.io/docs/reference/using-api/cel/ Required. */
  @K8sDslMarker var expression: String?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface MatchCondition_admissionregistration_k8s_io_v1alpha1: K8sManifest {
  /** Name is an identifier for this match condition, used for strategic merging of MatchConditions, as well as providing an
identifier for logging purposes. A good name should be descriptive of the associated expression. Name must be a
qualified name consisting of alphanumeric characters, '-', '_' or '.', and must start and end with an alphanumeric
character (e.g. 'MyName', or 'my.name', or '123-abc', regex used for validation is
'([A-Za-z0-9][-A-Za-z0-9_.]`*`)?[A-Za-z0-9]') with an optional DNS subdomain prefix and '/' (e.g. 'example.com/MyName')
Required. */
  @K8sDslMarker var name: String?
  /** Expression represents the expression which will be evaluated by CEL. Must evaluate to bool. CEL expressions have access
to the contents of the AdmissionRequest and Authorizer, organized into CEL variables: 'object' - The object from the
incoming request. The value is null for DELETE requests. 'oldObject' - The existing object. The value is null for CREATE
requests. 'request' - Attributes of the admission request(/pkg/apis/admission/types.go#AdmissionRequest). 'authorizer' -
A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the
request. See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz 'authorizer.requestResource' - A CEL
ResourceCheck constructed from the 'authorizer' and configured with the request resource. Documentation on CEL:
https://kubernetes.io/docs/reference/using-api/cel/ Required. */
  @K8sDslMarker var expression: String?
}