// Generated by delombok at Fri Aug 02 01:04:31 UTC 2024
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
    @lombok.Generated
    private SecondaryElementType(final Optional<String> label) {
        this.label = label;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public Optional<String> getLabel() {
        return this.label;
    }
}
