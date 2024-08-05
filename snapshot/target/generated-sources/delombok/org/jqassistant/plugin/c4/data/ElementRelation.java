// Generated by delombok at Mon Aug 05 00:20:46 UTC 2024
package org.jqassistant.plugin.c4.data;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Representation of a relation between C4 elements.
 *
 * @author Stephan Pirnbaum
 */
public class ElementRelation {
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ElementRelation.class);
    private final String from;
    private final String to;
    private final String name;
    private final String description;
    private final Set<String> technologies;
    private final Set<String> stereotypes;
    private final Map<String, String> properties;

    public String buildStringRepresentation(String sourceName, Long sourceNode, String targetName, Long targetNode) {
        String label;
        if (stereotypes.size() > 1) {
            label = stereotypes.stream().findFirst().get();
            log.warn("Relation between {} and {} has more then one stereotype. Using {}", sourceName, targetName, label);
        } else if (stereotypes.size() == 1) {
            label = stereotypes.stream().findFirst().get();
        } else {
            label = "DEPENDS_ON";
            log.warn("Relation between {} and {} has no stereotypes. Using default {}", sourceName, targetName, label);
        }
        return String.format(":%s{%s%s%s%s}", label, buildNameString(), buildDescriptionString(), buildTechnologiesString(), buildPropertiesString());
    }

    private String buildNameString() {
        return "name: \"" + this.name + "\"";
    }

    private String buildDescriptionString() {
        if (StringUtils.isEmpty(description)) {
            return "";
        } else {
            return ", description: \"" + description + "\"";
        }
    }

    private String buildPropertiesString() {
        if (MapUtils.isEmpty(this.properties)) {
            return "";
        } else {
            return ", " + properties.entrySet().stream().map(e -> e.getKey() + ": \"" + e.getValue() + "\"").collect(Collectors.joining(", "));
        }
    }

    private String buildTechnologiesString() {
        if (CollectionUtils.isEmpty(this.technologies)) {
            return "";
        } else {
            return ", technologies: [" + this.technologies.stream().map(s -> "\"" + s + "\"").collect(Collectors.joining(", ")) + "]";
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    private static Set<String> $default$technologies() {
        return new LinkedHashSet<>();
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    private static Set<String> $default$stereotypes() {
        return new LinkedHashSet<>();
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    ElementRelation(final String from, final String to, final String name, final String description, final Set<String> technologies, final Set<String> stereotypes, final Map<String, String> properties) {
        this.from = from;
        this.to = to;
        this.name = name;
        this.description = description;
        this.technologies = technologies;
        this.stereotypes = stereotypes;
        this.properties = properties;
    }


    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static class ElementRelationBuilder {
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private String from;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private String to;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private String name;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private String description;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private boolean technologies$set;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private Set<String> technologies$value;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private boolean stereotypes$set;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private Set<String> stereotypes$value;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private Map<String, String> properties;

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        ElementRelationBuilder() {
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public ElementRelation.ElementRelationBuilder from(final String from) {
            this.from = from;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public ElementRelation.ElementRelationBuilder to(final String to) {
            this.to = to;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public ElementRelation.ElementRelationBuilder name(final String name) {
            this.name = name;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public ElementRelation.ElementRelationBuilder description(final String description) {
            this.description = description;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public ElementRelation.ElementRelationBuilder technologies(final Set<String> technologies) {
            this.technologies$value = technologies;
            technologies$set = true;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public ElementRelation.ElementRelationBuilder stereotypes(final Set<String> stereotypes) {
            this.stereotypes$value = stereotypes;
            stereotypes$set = true;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public ElementRelation.ElementRelationBuilder properties(final Map<String, String> properties) {
            this.properties = properties;
            return this;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public ElementRelation build() {
            Set<String> technologies$value = this.technologies$value;
            if (!this.technologies$set) technologies$value = ElementRelation.$default$technologies();
            Set<String> stereotypes$value = this.stereotypes$value;
            if (!this.stereotypes$set) stereotypes$value = ElementRelation.$default$stereotypes();
            return new ElementRelation(this.from, this.to, this.name, this.description, technologies$value, stereotypes$value, this.properties);
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public java.lang.String toString() {
            return "ElementRelation.ElementRelationBuilder(from=" + this.from + ", to=" + this.to + ", name=" + this.name + ", description=" + this.description + ", technologies$value=" + this.technologies$value + ", stereotypes$value=" + this.stereotypes$value + ", properties=" + this.properties + ")";
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static ElementRelation.ElementRelationBuilder builder() {
        return new ElementRelation.ElementRelationBuilder();
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public ElementRelation.ElementRelationBuilder toBuilder() {
        return new ElementRelation.ElementRelationBuilder().from(this.from).to(this.to).name(this.name).description(this.description).technologies(this.technologies).stereotypes(this.stereotypes).properties(this.properties);
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getFrom() {
        return this.from;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getTo() {
        return this.to;
    }
}
