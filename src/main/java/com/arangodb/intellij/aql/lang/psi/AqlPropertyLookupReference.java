package com.arangodb.intellij.aql.lang.psi;

import com.arangodb.intellij.aql.util.Icons;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class AqlPropertyLookupReference extends AqlPsiReference {


    public AqlPropertyLookupReference(final PsiElement element, final TextRange rangeInElement) {
        super(element, rangeInElement);
    }


    @NotNull
    @Override
    public Object[] getVariants() {

        return findAll(myElement.getProject()).stream()
                .map(name -> LookupElementBuilder
                        .create(name)
                        .withIcon(Icons.ICON_PROPERTY)
                        .withTypeText("property " + name + "()")
                        .bold()
                )
                .toArray(Object[]::new);
    }


}
