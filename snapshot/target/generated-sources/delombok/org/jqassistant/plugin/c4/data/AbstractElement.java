// Generated by delombok at Thu Jul 25 10:41:44 UTC 2024
package org.jqassistant.plugin.c4.data;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Representation of any C4 element.
 *
 * @author Stephan Pirnbaum
 */
public abstract class AbstractElement {
    private final String alias;
    private final String name;
    private final Set<String> stereotypes;
    private AbstractElement parent;

    /**
     * Creates a String representation of the C4 element for use in Cypher queries in the format: :Label*{Property*}
     *
     * @return The String representation.
     */
    public abstract String buildStringRepresentation();

    final String buildAliasString() {
        return "alias: \"" + this.alias + "\"";
    }

    final String buildNameString() {
        return ", name: \"" + this.name + "\"";
    }

    final String buildLabelString() {
        Set<String> labels = new LinkedHashSet<>();
        labels.add("C4");
        labels.addAll(getAdditionalStereotypes());
        labels.addAll(this.stereotypes);
        return ":" + String.join(":", labels);
    }

    /**
     * Get additional stereotypes of the C4 element for use as Cypher labels.
     *
     * @return The additional stereotypes.
     */
    abstract Set<String> getAdditionalStereotypes();

    @java.lang.SuppressWarnings("all")
    private static Set<String> $default$stereotypes() {
        return new HashSet<>();
    }


    @java.lang.SuppressWarnings("all")
    public static abstract class AbstractElementBuilder<C extends AbstractElement, B extends AbstractElement.AbstractElementBuilder<C, B>> {
        @java.lang.SuppressWarnings("all")
        private String alias;
        @java.lang.SuppressWarnings("all")
        private String name;
        @java.lang.SuppressWarnings("all")
        private boolean stereotypes$set;
        @java.lang.SuppressWarnings("all")
        private Set<String> stereotypes$value;
        @java.lang.SuppressWarnings("all")
        private AbstractElement parent;

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        public B alias(final String alias) {
            this.alias = alias;
            return self();
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        public B name(final String name) {
            this.name = name;
            return self();
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        public B stereotypes(final Set<String> stereotypes) {
            this.stereotypes$value = stereotypes;
            stereotypes$set = true;
            return self();
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        public B parent(final AbstractElement parent) {
            this.parent = parent;
            return self();
        }

        @java.lang.SuppressWarnings("all")
        protected abstract B self();

        @java.lang.SuppressWarnings("all")
        public abstract C build();

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public java.lang.String toString() {
            return "AbstractElement.AbstractElementBuilder(alias=" + this.alias + ", name=" + this.name + ", stereotypes$value=" + this.stereotypes$value + ", parent=" + this.parent + ")";
        }
    }

    @java.lang.SuppressWarnings("all")
    protected AbstractElement(final AbstractElement.AbstractElementBuilder<?, ?> b) {
        this.alias = b.alias;
        this.name = b.name;
        if (b.stereotypes$set) this.stereotypes = b.stereotypes$value;
         else this.stereotypes = AbstractElement.$default$stereotypes();
        this.parent = b.parent;
    }

    @java.lang.SuppressWarnings("all")
    public String getAlias() {
        return this.alias;
    }

    @java.lang.SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @java.lang.SuppressWarnings("all")
    public AbstractElement getParent() {
        return this.parent;
    }
}
