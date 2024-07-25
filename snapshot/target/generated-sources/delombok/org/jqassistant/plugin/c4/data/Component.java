// Generated by delombok at Thu Jul 25 09:10:19 UTC 2024
package org.jqassistant.plugin.c4.data;

/**
 * Representation of a C4 Component.
 *
 * @author Stephan Pirnbaum
 */
public class Component extends AbstractBuildingBlock {
    @Override
    String getPrimaryElementTypeLabel() {
        return "Component";
    }


    @java.lang.SuppressWarnings("all")
    public static abstract class ComponentBuilder<C extends Component, B extends Component.ComponentBuilder<C, B>> extends AbstractBuildingBlock.AbstractBuildingBlockBuilder<C, B> {
        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        protected abstract B self();

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public abstract C build();

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public java.lang.String toString() {
            return "Component.ComponentBuilder(super=" + super.toString() + ")";
        }
    }


    @java.lang.SuppressWarnings("all")
    private static final class ComponentBuilderImpl extends Component.ComponentBuilder<Component, Component.ComponentBuilderImpl> {
        @java.lang.SuppressWarnings("all")
        private ComponentBuilderImpl() {
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        protected Component.ComponentBuilderImpl self() {
            return this;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public Component build() {
            return new Component(this);
        }
    }

    @java.lang.SuppressWarnings("all")
    protected Component(final Component.ComponentBuilder<?, ?> b) {
        super(b);
    }

    @java.lang.SuppressWarnings("all")
    public static Component.ComponentBuilder<?, ?> builder() {
        return new Component.ComponentBuilderImpl();
    }
}