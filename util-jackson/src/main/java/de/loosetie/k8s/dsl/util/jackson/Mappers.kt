package de.loosetie.k8s.dsl.util.jackson

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import de.loosetie.k8s.dsl.types.MapDelegate
import de.loosetie.k8s.dsl.types.NumberOrString


object Mappers {
  val module = SimpleModule()
    .addSerializer(NumberOrString::class.java, NumberOrStringSerializer())
    .addSerializer(MapDelegate::class.java, MapDelegateSerializer())

  val objectMapper = ObjectMapper()
    .registerModule(module)
    .setSerializationInclusion(JsonInclude.Include.NON_NULL)
    .registerKotlinModule()

  val yamlPrinter = ObjectMapper(YAMLFactory())
    .registerModule(module)
    .registerKotlinModule()
    .setSerializationInclusion(JsonInclude.Include.NON_NULL)
    .writerWithDefaultPrettyPrinter()
}