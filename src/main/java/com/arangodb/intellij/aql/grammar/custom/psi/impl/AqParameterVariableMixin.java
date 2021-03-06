package com.arangodb.intellij.aql.grammar.custom.psi.impl;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlMixinType;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElementImpl;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class AqParameterVariableMixin extends AqlNamedElementImpl {
    public AqParameterVariableMixin(@NotNull final ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public AqlMixinType getAqlType() {
        return AqlMixinType.VAR_PARAMETER;
    }
}
