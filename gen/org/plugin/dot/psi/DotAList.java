// This is a generated file. Not intended for manual editing.
package org.plugin.dot.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DotAList extends PsiElement {

  @NotNull
  List<DotId> getIdList();

  @Nullable
  DotAList getAList();

  @Nullable
  DotCommentStmt getCommentStmt();

}
