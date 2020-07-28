package de.loosetie.k8s.dsl.types

import com.fasterxml.jackson.annotation.JsonIgnore
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest

@K8sDslMarker
class LimitsAndRequests(
  @JsonIgnore
  override val parent: K8sManifest?,
  val map: MutableMap<String, NumberOrString?> = mutableMapOf()
) : Map<String, NumberOrString?> by map, HasParent {

  var cpu: DoubleOrString? by map
  var memory: IntOrString? by map
  var `ephemeral-storage`: IntOrString? by map

  fun setHugepages(size: String, value: IntOrString) {
    map["hugepages-$size"] = value
  }

  fun getHugepages(size: String) =
    map["hugepages-$size"] as? IntOrString

  @K8sDslMarker
  operator fun set(name: String, double: Double) {
    map[name] = DoubleOrString(double)
  }

  @K8sDslMarker
  operator fun set(name: String, string: String) {
    map[name] = DoubleOrString(string)
  }

  override operator fun get(name: String) =
    map[name]
}


@K8sDslMarker
fun LimitsAndRequests.cpu(double: Double) {
  DoubleOrString(double)
    .also { cpu = it }
}

@K8sDslMarker
fun LimitsAndRequests.cpu(string: String) {
  DoubleOrString(string)
    .also { cpu = it }
}

@K8sDslMarker
fun LimitsAndRequests.memory(int: Int) {
  IntOrString(int)
    .also { memory = it }
}

@K8sDslMarker
fun LimitsAndRequests.memory(string: String) {
  IntOrString(string)
    .also { memory = it }
}

@K8sDslMarker
fun LimitsAndRequests.`ephemeral-storage`(int: Int) {
  IntOrString(int)
    .also { `ephemeral-storage` = it }
}

@K8sDslMarker
fun LimitsAndRequests.`ephemeral-storage`(string: String) {
  IntOrString(string)
    .also { `ephemeral-storage` = it }
}

@K8sDslMarker
fun LimitsAndRequests.hugepages(size: String, int: Int) {
  IntOrString(int)
    .also { setHugepages(size, it) }
}

@K8sDslMarker
fun LimitsAndRequests.hugepages(size: String, string: String) {
  IntOrString(string)
    .also { setHugepages(size, it) }
}

