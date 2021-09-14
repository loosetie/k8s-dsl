package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_18: K8sManifest {
  /** `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified,
system trust roots on the apiserver are used. */
  @K8sDslMarker var caBundle: String?
  /** `service` is a reference to the service for this webhook. Either `service` or `url` must be specified. If the webhook is
running within the cluster, then you should use `service`. */
  val service: ServiceReference_admissionregistration_k8s_io_v1_k8s1_18?
  /** `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or
`service` must be specified. The `host` should not refer to a service running in the cluster; use the `service` field
instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
in-cluster DNS as that would be a layering violation). `host` may also be an IP address. Please note that using
`localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an
apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to
turn up in a new cluster. The scheme must be "https"; the URL must begin with "https://". A path is optional, and if
present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for
example, a cluster identifier. Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments
("#...") and query parameters ("?...") are not allowed, either. */
  @K8sDslMarker var url: String?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_18: K8sManifest {
  /** caBundle is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified,
system trust roots on the apiserver are used. */
  @K8sDslMarker var caBundle: String?
  /** service is a reference to the service for this webhook. Either service or url must be specified. If the webhook is
running within the cluster, then you should use `service`. */
  val service: ServiceReference_apiextensions_k8s_io_v1_k8s1_18?
  /** url gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or
`service` must be specified. The `host` should not refer to a service running in the cluster; use the `service` field
instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
in-cluster DNS as that would be a layering violation). `host` may also be an IP address. Please note that using
`localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an
apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to
turn up in a new cluster. The scheme must be "https"; the URL must begin with "https://". A path is optional, and if
present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for
example, a cluster identifier. Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments
("#...") and query parameters ("?...") are not allowed, either. */
  @K8sDslMarker var url: String?
}

@Deprecated(message="Old api version")
@K8sDslMarker
interface WebhookClientConfig_auditregistration_k8s_io_v1alpha1_k8s1_18: K8sManifest {
  /** `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified,
system trust roots on the apiserver are used. */
  @K8sDslMarker var caBundle: String?
  /** `service` is a reference to the service for this webhook. Either `service` or `url` must be specified. If the webhook is
running within the cluster, then you should use `service`. */
  val service: ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_18?
  /** `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or
`service` must be specified. The `host` should not refer to a service running in the cluster; use the `service` field
instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve
in-cluster DNS as that would be a layering violation). `host` may also be an IP address. Please note that using
`localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an
apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to
turn up in a new cluster. The scheme must be "https"; the URL must begin with "https://". A path is optional, and if
present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for
example, a cluster identifier. Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments
("#...") and query parameters ("?...") are not allowed, either. */
  @K8sDslMarker var url: String?
}