// Generated by delombok at Fri Aug 16 01:12:33 UTC 2024
package org.jqassistant.plugin.c4.data;

/**
 * Representation of a C4 Container.
 *
 * @author Stephan Pirnbaum
 */
public class Container extends AbstractBuildingBlock {
    @Override
    String getPrimaryElementTypeLabel() {
        return "Container";
    }


    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static abstract class ContainerBuilder<C extends Container, B extends Container.ContainerBuilder<C, B>> extends AbstractBuildingBlock.AbstractBuildingBlockBuilder<C, B> {
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
            return "Container.ContainerBuilder(super=" + super.toString() + ")";
        }
    }


    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    private static final class ContainerBuilderImpl extends Container.ContainerBuilder<Container, Container.ContainerBuilderImpl> {
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private ContainerBuilderImpl() {
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        protected Container.ContainerBuilderImpl self() {
            return this;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Container build() {
            return new Container(this);
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected Container(final Container.ContainerBuilder<?, ?> b) {
        super(b);
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static Container.ContainerBuilder<?, ?> builder() {
        return new Container.ContainerBuilderImpl();
    }
}
