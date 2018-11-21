package com.machak.aql.grammar.psi.impl;

import com.intellij.lang.ASTNode;
import com.machak.aql.grammar.psi.AqlMixinType;
import com.machak.aql.grammar.psi.AqlNamedElementImpl;
import org.jetbrains.annotations.NotNull;

public abstract class AqlKeywordMixin extends AqlNamedElementImpl {
    public AqlKeywordMixin(@NotNull final ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public AqlMixinType getAqlType() {
        return AqlMixinType.KEYWORD;
    }
}
