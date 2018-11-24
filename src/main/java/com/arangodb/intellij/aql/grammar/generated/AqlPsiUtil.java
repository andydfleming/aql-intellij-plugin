package com.arangodb.intellij.aql.grammar.generated;

import com.arangodb.intellij.aql.grammar.psi.AqlNamedElement;
import com.intellij.psi.impl.PsiImplUtil;

public final class AqlPsiUtil {
    private AqlPsiUtil() {
    }

    //############################################
    // BNF used methods
    //############################################
    public static String getName(final AqlNamedElement element) {
        return element.getText();
    }

    public static AqlNamedElement setName(final AqlNamedElement element, final String newName) {
        PsiImplUtil.setName(element, newName);
        return element;
    }

}