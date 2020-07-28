package de.loosetie.k8s.dsl.types

class DoubleOrString private constructor(
  override val value: String,
  override val isString: Boolean
) : NumberOrString {

  constructor(string: String) : this(string, true)
  constructor(double: Double) : this("$double", false)

  override fun toString(): String {
    return if (isString) "\"$value\"" else value
  }
}