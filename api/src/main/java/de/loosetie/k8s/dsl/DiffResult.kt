package de.loosetie.k8s.dsl

enum class DiffResult {
  NEW,
  UNCHANGED,
  NEW_FIELD,
  CHANGED_OR_DELETED_FIELD,
  REMOVED
}