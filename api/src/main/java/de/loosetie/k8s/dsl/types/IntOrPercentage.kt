package de.loosetie.k8s.dsl.types

class IntOrPercentage private constructor(
  override val value: String,
  override val isString: Boolean
) : NumberOrString {

  constructor(percentage: String) : this(percentage, true)
  constructor(int: Int) : this("$int", false)

  override fun toString(): String {
    return if (isString) "\"$value\"" else value
  }
}