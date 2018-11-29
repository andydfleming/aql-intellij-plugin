// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlFunCosImpl extends ASTWrapperPsiElement implements AqlFunCos {

    public AqlFunCosImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitFunCos(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof AqlVisitor) {
            accept((AqlVisitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

    @Override
    @Nullable
    public AqlNumberType getNumberType() {
        return findChildByClass(AqlNumberType.class);
    }

    @Override
    @Nullable
    public AqlObjectExpression getObjectExpression() {
        return findChildByClass(AqlObjectExpression.class);
    }

    @Override
    @Nullable
    public AqlParameterVariable getParameterVariable() {
        return findChildByClass(AqlParameterVariable.class);
    }

    @Override
    @Nullable
    public AqlPropertyName getPropertyName() {
        return findChildByClass(AqlPropertyName.class);
    }

    @Override
    @Nullable
    public AqlVariablePlaceHolder getVariablePlaceHolder() {
        return findChildByClass(AqlVariablePlaceHolder.class);
    }

    @Override
    @NotNull
    public PsiElement getFCos() {
        return findNotNullChildByType(F_COS);
    }

}