package de.loosetie.k8s.dsl.util.jackson

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import de.loosetie.k8s.dsl.types.MapDelegate

class MapDelegateSerializer : StdSerializer<MapDelegate<*>>(MapDelegate::class.java) {

  override fun serialize(
    mapDelegate: MapDelegate<*>,
    jgen: JsonGenerator,
    provider: SerializerProvider
  ) {
    jgen.writeObject(mapDelegate.map)
  }
}