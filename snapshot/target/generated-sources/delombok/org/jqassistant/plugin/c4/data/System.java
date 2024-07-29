// Generated by delombok at Mon Jul 29 09:36:52 UTC 2024
package org.jqassistant.plugin.c4.data;

/**
 * Representation of a C4 System.
 *
 * @author Stephan Pirnbaum
 */
public class System extends AbstractBuildingBlock {
    @Override
    String getPrimaryElementTypeLabel() {
        return "System";
    }


    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static abstract class SystemBuilder<C extends System, B extends System.SystemBuilder<C, B>> extends AbstractBuildingBlock.AbstractBuildingBlockBuilder<C, B> {
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
            return "System.SystemBuilder(super=" + super.toString() + ")";
        }
    }


    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    private static final class SystemBuilderImpl extends System.SystemBuilder<System, System.SystemBuilderImpl> {
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private SystemBuilderImpl() {
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        protected System.SystemBuilderImpl self() {
            return this;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public System build() {
            return new System(this);
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected System(final System.SystemBuilder<?, ?> b) {
        super(b);
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static System.SystemBuilder<?, ?> builder() {
        return new System.SystemBuilderImpl();
    }
}
