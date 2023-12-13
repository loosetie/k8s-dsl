package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EnvVar_core_v1: K8sManifest {
  /** Name of the environment variable. Must be a C_IDENTIFIER. */
  @K8sDslMarker var name: String?
  /** Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any
service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged.
Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce
the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists
or not. Defaults to "". */
  @K8sDslMarker var value: String?
  /** Source for the environment variable's value. Cannot be used if value is not empty. */
  val valueFrom: EnvVarSource_core_v1?
}