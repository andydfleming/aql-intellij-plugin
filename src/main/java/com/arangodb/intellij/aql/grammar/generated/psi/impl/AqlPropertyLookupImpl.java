// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqlPropertyLookupMixin;
import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AqlPropertyLookupImpl extends AqlPropertyLookupMixin implements AqlPropertyLookup {

  public AqlPropertyLookupImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitPropertyLookup(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlExpressionType getExpressionType() {
    return findChildByClass(AqlExpressionType.class);
  }

  @Override
  @Nullable
  public AqlPropertyName getPropertyName() {
    return findChildByClass(AqlPropertyName.class);
  }

  @Override
  @Nullable
  public AqlSystemProperty getSystemProperty() {
    return findChildByClass(AqlSystemProperty.class);
  }

  public String getName() {
    return AqlPsiUtil.getName(this);
  }

  public AqlNamedElement setName(String newName) {
    return AqlPsiUtil.setName(this, newName);
  }

  public ItemPresentation getPresentation() {
    return AqlPsiUtil.getPresentation(this);
  }

}
