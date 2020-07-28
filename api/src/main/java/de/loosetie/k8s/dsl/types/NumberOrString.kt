package de.loosetie.k8s.dsl.types

import de.loosetie.k8s.dsl.K8sDslForConstructors

interface NumberOrString : K8sDslForConstructors {
  val value: String
  val isString: Boolean
}