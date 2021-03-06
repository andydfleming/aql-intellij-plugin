// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlExpressionType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunctionExpression;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlNamedFunctions;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AqlFunctionExpressionImpl extends ASTWrapperPsiElement implements AqlFunctionExpression {

  public AqlFunctionExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunctionExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AqlExpressionType> getExpressionTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlExpressionType.class);
  }

  @Override
  @NotNull
  public AqlNamedFunctions getNamedFunctions() {
    return findNotNullChildByClass(AqlNamedFunctions.class);
  }

}
