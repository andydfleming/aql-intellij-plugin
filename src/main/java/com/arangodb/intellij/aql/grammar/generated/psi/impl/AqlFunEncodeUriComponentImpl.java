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

public class AqlFunEncodeUriComponentImpl extends ASTWrapperPsiElement implements AqlFunEncodeUriComponent {

  public AqlFunEncodeUriComponentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunEncodeUriComponent(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
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
  public AqlStringType getStringType() {
    return findChildByClass(AqlStringType.class);
  }

  @Override
  @Nullable
  public AqlVariablePlaceHolder getVariablePlaceHolder() {
    return findChildByClass(AqlVariablePlaceHolder.class);
  }

  @Override
  @NotNull
  public PsiElement getFEncodeUriComponent() {
    return findNotNullChildByType(F_ENCODE_URI_COMPONENT);
  }

}
