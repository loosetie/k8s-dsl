package de.loosetie.k8s.dsl.util.jackson

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import de.loosetie.k8s.dsl.types.NumberOrString

class NumberOrStringSerializer : StdSerializer<NumberOrString>(NumberOrString::class.java) {

  override fun serialize(
    numberOrString: NumberOrString,
    jgen: JsonGenerator,
    provider: SerializerProvider
  ) {
    if (numberOrString.isString) {
      jgen.writeString(numberOrString.value)
    } else {
      jgen.writeNumber(numberOrString.value.toBigDecimal())
    }
  }
}