package de.loosetie.k8s.dsl

enum class ManifestChange {
  NEW,
  UNCHANGED,
  EXTENDED, // Some fields have changed
  CHANGED, // Some new fields appeared
  REMOVED // ID doe not appear in newer version
}

enum class ManifestFieldChange {
  NEW, // If name does not exist yet
  UNCHANGED, // Nothing has changed,
  CHANGED, // The same name, type has changed
  DESC_CHANGED // The same name, different description -> goes to extended
}