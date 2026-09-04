package com.electronik54.revision_3.corejava.ch92_sealed_classes_advanced.solution;

/**
 * Sealed interface: the Result pattern - expected failures as values,
 * not exceptions. Only the listed implementations exist.
 */
public sealed interface Result<T> permits Success, Error, LegacyResult {
}