package de.loosetie.k8s.dsl.types

import com.fasterxml.jackson.annotation.JsonIgnore
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest

@K8sDslMarker
class Capacity(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  val map: MutableMap<String, Any?> = mutableMapOf()
) : Map<String, Any?> by map, HasParent {

  @K8sDslMarker
  var storage: String? by map

  @K8sDslMarker
  operator fun set(name: String, double: Double) {
    map[name] = DoubleOrString(double)
  }

  @K8sDslMarker
  operator fun set(name: String, string: String) {
    map[name] = DoubleOrString(string)
  }

  override operator fun get(name: String) =
    map[name] as? DoubleOrString

}


