// This is a generated file. Not intended for manual editing.
package org.plugin.dot.psi.impl;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static org.plugin.dot.psi.DotTypes.*;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.plugin.dot.psi.*;

public class DotEolImpl extends ASTWrapperPsiElement implements DotEol {

    public DotEolImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DotVisitor visitor) {
        visitor.visitEol(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DotVisitor) {
            accept((DotVisitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

}
