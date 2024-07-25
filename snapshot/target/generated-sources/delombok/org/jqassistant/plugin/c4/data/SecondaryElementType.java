// Generated by delombok at Thu Jul 25 09:10:19 UTC 2024
package org.jqassistant.plugin.c4.data;

import java.util.Optional;

/**
 * Enum for the secondary element type.
 *
 * @author Stephan Pirnbaum
 */
public enum SecondaryElementType {
    DEFAULT(Optional.empty()), DB(Optional.of("DB")), QUEUE(Optional.of("Queue"));
    private final Optional<String> label;

    @java.lang.SuppressWarnings("all")
    private SecondaryElementType(final Optional<String> label) {
        this.label = label;
    }

    @java.lang.SuppressWarnings("all")
    public Optional<String> getLabel() {
        return this.label;
    }
}