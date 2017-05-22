package ru.sbt.qa.customLanguage.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.sbt.qa.customLanguage.syntaxHiglighting.GherkinElementTypes;
import ru.sbt.qa.customLanguage.syntaxHiglighting.GherkinElementVisitor;
import ru.sbt.qa.customLanguage.syntaxHiglighting.GherkinPsiElementBase;
import ru.sbt.qa.customLanguage.syntaxHiglighting.GherkinTable;


/**
 * @author yole
 */
public class GherkinExamplesBlockImpl extends GherkinPsiElementBase implements GherkinExamplesBlock {
  private static final TokenSet TABLE_FILTER = TokenSet.create(GherkinElementTypes.TABLE);

  public GherkinExamplesBlockImpl(@NotNull final ASTNode node) {
    super(node);
  }

  @Override
  public String toString() {
    return "GherkinExamplesBlock:" + getElementText();
  }

  @Override
  protected String getPresentableText() {
    return buildPresentableText("Examples");
  }

  protected void acceptGherkin(GherkinElementVisitor gherkinElementVisitor) {
    gherkinElementVisitor.visitExamplesBlock(this);
  }

  @Nullable
  public GherkinTable getTable() {
    final ASTNode node = getNode();

    final ASTNode tableNode = node.findChildByType(TABLE_FILTER);
    return tableNode == null ? null : (GherkinTable)tableNode.getPsi();
  }
}