package de.loosetie.k8s.dsl.types

import com.fasterxml.jackson.annotation.JsonIgnore
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest

@K8sDslMarker
class CpuMem(
  @JsonIgnore
  override val parent: K8sManifest? = null
) : HasParent {
  @K8sDslMarker
  var cpu: DoubleOrString? = null

  @K8sDslMarker
  var memory: IntOrString? = null
}

@K8sDslMarker
fun CpuMem.cpu(double: Double) {
  DoubleOrString(double)
    .also { cpu = it }
}

@K8sDslMarker
fun CpuMem.cpu(string: String) {
  DoubleOrString(string)
    .also { cpu = it }
}

@K8sDslMarker
fun CpuMem.memory(int: Int) {
  IntOrString(int)
    .also { memory = it }
}

@K8sDslMarker
fun CpuMem.memory(string: String) {
  IntOrString(string)
    .also { memory = it }
}