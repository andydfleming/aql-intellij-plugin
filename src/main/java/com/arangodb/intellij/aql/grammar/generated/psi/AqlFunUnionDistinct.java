// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface AqlFunUnionDistinct extends PsiElement {

  @NotNull
  List<AqlNumberType> getNumberTypeList();

  @NotNull
  List<AqlObjectExpression> getObjectExpressionList();

  @NotNull
  List<AqlParameterVariable> getParameterVariableList();

  @NotNull
  List<AqlPropertyName> getPropertyNameList();

  @NotNull
  List<AqlQueryItem> getQueryItemList();

  @NotNull
  List<AqlVariablePlaceHolder> getVariablePlaceHolderList();

  @NotNull
  PsiElement getFUnionDistinct();

}
