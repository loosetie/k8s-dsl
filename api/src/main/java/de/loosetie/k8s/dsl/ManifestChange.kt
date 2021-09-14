package de.loosetie.k8s.dsl

enum class ManifestChange {
  NEW,
  UNCHANGED,
  EXTENDED,
  CHANGED,
  REMOVED
}

enum class ManifestFieldChange {
  NEW, // Neu hinzugekommen: Teste nur nach name
  UNCHANGED, // Alles gleich
  CHANGED // name gleich, etwas anderes nicht
}