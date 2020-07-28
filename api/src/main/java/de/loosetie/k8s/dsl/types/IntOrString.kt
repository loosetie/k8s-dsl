package de.loosetie.k8s.dsl.types

class IntOrString private constructor(
  override val value: String,
  override val isString: Boolean
) : NumberOrString {

  constructor(string: String) : this(string, true)
  constructor(int: Int) : this("$int", false)

  override fun toString(): String {
    return if (isString) "\"$value\"" else value
  }
}