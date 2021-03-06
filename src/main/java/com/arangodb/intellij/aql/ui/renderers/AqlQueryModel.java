package com.arangodb.intellij.aql.ui.renderers;

import com.arangodb.intellij.aql.util.Icons;
import com.intellij.ui.SimpleTextAttributes;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Collections;
import java.util.Map;

public class AqlQueryModel {


    public enum Type {
        ROOT, WITH_PARAMS, TEXT_ONLY, EXPLAIN, PROFILE
    }

    private String name;
    private boolean selected;
    private Map<String, String> parameters;

    private Type type = Type.TEXT_ONLY;

    public AqlQueryModel(final String name, final Map<String, String> parameters, final Type type) {
        this(name, type);
        this.parameters = parameters;
    }


    public AqlQueryModel(final String name, final Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    @NotNull
    public Map<String, String> getParameters() {
        if (parameters == null) {
            return Collections.emptyMap();
        }
        return parameters;
    }

    public void setParameters(final Map<String, String> parameters) {
        this.parameters = parameters;
    }

    @NotNull
    public Icon getIcon() {
        if (type == null) {
            return Icons.ICON_TEXT;
        }
        else if (type == Type.TEXT_ONLY) {
            return Icons.ICON_TEXT;
        } else if (type == Type.WITH_PARAMS) {
            return Icons.ICON_PARAMETER;
        } else if (type == Type.ROOT) {
            return Icons.ICON_QUERY;
        }
        return Icons.ICON_TEXT;

    }


    public SimpleTextAttributes getStyle() {
        if (selected) {
            return SimpleTextAttributes.REGULAR_BOLD_ATTRIBUTES;
        }

        if (type.equals(Type.EXPLAIN) || type.equals(Type.PROFILE)) {
            return SimpleTextAttributes.REGULAR_ITALIC_ATTRIBUTES;
        }
        return SimpleTextAttributes.REGULAR_ATTRIBUTES;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(final boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return name;
    }
}
