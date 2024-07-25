// Generated by delombok at Thu Jul 25 09:10:24 UTC 2024
package org.jqassistant.plugin.c4.data;

/**
 * Representation of a C4 Person.
 *
 * @author Stephan Pirnbaum
 */
public class Person extends AbstractBuildingBlock {
    @Override
    String getPrimaryElementTypeLabel() {
        return "Person";
    }


    @java.lang.SuppressWarnings("all")
    public static abstract class PersonBuilder<C extends Person, B extends Person.PersonBuilder<C, B>> extends AbstractBuildingBlock.AbstractBuildingBlockBuilder<C, B> {
        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        protected abstract B self();

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public abstract C build();

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public java.lang.String toString() {
            return "Person.PersonBuilder(super=" + super.toString() + ")";
        }
    }


    @java.lang.SuppressWarnings("all")
    private static final class PersonBuilderImpl extends Person.PersonBuilder<Person, Person.PersonBuilderImpl> {
        @java.lang.SuppressWarnings("all")
        private PersonBuilderImpl() {
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        protected Person.PersonBuilderImpl self() {
            return this;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public Person build() {
            return new Person(this);
        }
    }

    @java.lang.SuppressWarnings("all")
    protected Person(final Person.PersonBuilder<?, ?> b) {
        super(b);
    }

    @java.lang.SuppressWarnings("all")
    public static Person.PersonBuilder<?, ?> builder() {
        return new Person.PersonBuilderImpl();
    }
}
