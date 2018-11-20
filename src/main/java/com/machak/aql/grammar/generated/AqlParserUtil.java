package com.machak.aql.grammar.generated;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

public class AqlParserUtil extends GeneratedParserUtilBase {


    public static boolean consumeTokenFast(final PsiBuilder builder, final TokenSet tokens) {
        if (nextTokenIsFast(builder, tokens)) {
            builder.advanceLexer();
            return true;
        }
        return false;
    }

    public static boolean nextTokenIsFast(final PsiBuilder builder, final IElementType token) {
        return builder.getTokenType() == token;
    }

    public static boolean nextTokenIsFast(final PsiBuilder builder, final IElementType... tokens) {
        final IElementType tokenType = builder.getTokenType();
        for (IElementType token : tokens) {
            if (token == tokenType) {
                return true;
            }
        }
        return false;
    }

    public static boolean nextTokenIsFast(final PsiBuilder builder, final TokenSet tokens) {
        return tokens.contains(builder.getTokenType());
    }

}
