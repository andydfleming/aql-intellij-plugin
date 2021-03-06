// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlFunReverse extends PsiElement {

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

  @Nullable
  AqlStringType getStringType();

  @NotNull
  List<AqlVariablePlaceHolder> getVariablePlaceHolderList();

  @Nullable
  PsiElement getFReverse();

}
