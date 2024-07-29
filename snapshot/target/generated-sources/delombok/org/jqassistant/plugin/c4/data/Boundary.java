// Generated by delombok at Mon Jul 29 09:37:01 UTC 2024
package org.jqassistant.plugin.c4.data;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Representation of a C4 boundary.
 *
 * @author Stephan Pirnbaum
 */
public class Boundary extends AbstractElement {
    private final String type;

    @Override
    public String buildStringRepresentation() {
        return String.format("%s{%s%s}", buildLabelString(), buildAliasString(), buildNameString());
    }

    @Override
    Set<String> getAdditionalStereotypes() {
        Set<String> labels = new LinkedHashSet<>();
        labels.add("Boundary");
        if (type != null) {
            labels.add(type);
        }
        return labels;
    }


    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static abstract class BoundaryBuilder<C extends Boundary, B extends Boundary.BoundaryBuilder<C, B>> extends AbstractElement.AbstractElementBuilder<C, B> {
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private String type;

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public B type(final String type) {
            this.type = type;
            return self();
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        protected abstract B self();

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public abstract C build();

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public java.lang.String toString() {
            return "Boundary.BoundaryBuilder(super=" + super.toString() + ", type=" + this.type + ")";
        }
    }


    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    private static final class BoundaryBuilderImpl extends Boundary.BoundaryBuilder<Boundary, Boundary.BoundaryBuilderImpl> {
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private BoundaryBuilderImpl() {
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        protected Boundary.BoundaryBuilderImpl self() {
            return this;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Boundary build() {
            return new Boundary(this);
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected Boundary(final Boundary.BoundaryBuilder<?, ?> b) {
        super(b);
        this.type = b.type;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static Boundary.BoundaryBuilder<?, ?> builder() {
        return new Boundary.BoundaryBuilderImpl();
    }
}
