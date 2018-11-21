package com.machak.aql.lang.psi;

import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.machak.aql.grammar.generated.psi.AqlTypes;
import com.machak.aql.util.Icons;
import org.jetbrains.annotations.NotNull;

public class AqlFunctionReference extends AqlPsiReference {


    public AqlFunctionReference(final PsiElement element, final TextRange rangeInElement) {
        super(element, rangeInElement);
    }


    @NotNull
    @Override
    public Object[] getVariants() {

        return findAll(myElement.getProject(), AqlTypes.NAMED_KEYWORD_FUNCTIONS).stream()
                .map(name -> LookupElementBuilder
                        .create(name)
                        .withIcon(Icons.ICON_FUNCTION)
                        .withTypeText("function " + name + "()")
                        .bold()
                )
                .toArray(Object[]::new);
    }


}