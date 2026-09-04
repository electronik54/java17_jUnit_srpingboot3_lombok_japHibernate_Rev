package com.electronik54.revision_3.corejava.ch92_sealed_classes_advanced.solution;

/**
 * NON-SEALED branch: re-opens this part of the hierarchy -
 * ANY class may implement LegacyResult, unlike Success/Error.
 */
public non-sealed interface LegacyResult<T> extends Result<T> {

    String raw();
}