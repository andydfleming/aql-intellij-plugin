/*
 * Copyright 2018 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This is a generated file. Not intended for manual editing.
package com.machak.aql.gramamr.generated;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;


public interface GeneratedTypes {

    IElementType EXPR = new IElementType("EXPR", null);

    IElementType BLOCK_COMMENT = new IElementType("block_comment", null);
    IElementType COMMENT = new IElementType("comment", null);
    IElementType EXTERNAL_END = new IElementType(">>", null);
    IElementType EXTERNAL_START = new IElementType("<<", null);
    IElementType FOR = new IElementType("FOR", null);
    IElementType ID = new IElementType("id", null);
    IElementType IN = new IElementType("IN", null);
    IElementType LEFT_BRACE = new IElementType("{", null);
    IElementType LEFT_BRACKET = new IElementType("[", null);
    IElementType LEFT_PAREN = new IElementType("(", null);
    IElementType NUMBER = new IElementType("number", null);
    IElementType OP_AND = new IElementType("&", null);
    IElementType OP_EQ = new IElementType("=", null);
    IElementType OP_IS = new IElementType("::=", null);
    IElementType OP_NOT = new IElementType("!", null);
    IElementType OP_ONEMORE = new IElementType("+", null);
    IElementType OP_OPT = new IElementType("?", null);
    IElementType OP_OR = new IElementType("|", null);
    IElementType OP_ZEROMORE = new IElementType("*", null);
    IElementType RETURN = new IElementType("RETURN", null);
    IElementType RIGHT_BRACE = new IElementType("}", null);
    IElementType RIGHT_BRACKET = new IElementType("]", null);
    IElementType RIGHT_PAREN = new IElementType(")", null);
    IElementType SEMICOLON = new IElementType(";", null);

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == EXPR) {
                return new ExprImpl(node);
            }
            throw new AssertionError("Unknown element type: " + type);
        }
    }
}
