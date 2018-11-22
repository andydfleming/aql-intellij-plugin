// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.generated.AqlPsiUtil;
import com.machak.aql.grammar.generated.psi.AqlParameterVariable;
import com.machak.aql.grammar.generated.psi.AqlPropertyName;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import com.machak.aql.grammar.psi.AqlNamedElement;
import com.machak.aql.grammar.psi.impl.AqParameterVariableMixin;
import org.jetbrains.annotations.NotNull;

public class AqlParameterVariableImpl extends AqParameterVariableMixin implements AqlParameterVariable {

    public AqlParameterVariableImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitParameterVariable(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof AqlVisitor) {
            accept((AqlVisitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

    @Override
    @NotNull
    public AqlPropertyName getPropertyName() {
        return findNotNullChildByClass(AqlPropertyName.class);
    }

    public String getName() {
        return AqlPsiUtil.getName(this);
    }

    public AqlNamedElement setName(String newName) {
        return AqlPsiUtil.setName(this, newName);
    }

}