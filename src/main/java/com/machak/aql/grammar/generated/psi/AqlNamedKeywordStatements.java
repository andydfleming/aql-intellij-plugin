// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import com.machak.aql.grammar.psi.AqlNamedElement;
import org.jetbrains.annotations.NotNull;

public interface AqlNamedKeywordStatements extends PsiElement {

    @NotNull
    AqlKeywordStatements getKeywordStatements();

    String getName();

    AqlNamedElement setName(String newName);

}