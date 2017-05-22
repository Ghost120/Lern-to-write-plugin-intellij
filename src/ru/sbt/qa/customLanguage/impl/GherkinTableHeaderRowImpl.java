package ru.sbt.qa.customLanguage.impl;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import ru.sbt.qa.customLanguage.syntaxHiglighting.GherkinElementVisitor;


/**
 * @author yole
 */
public class GherkinTableHeaderRowImpl extends GherkinTableRowImpl {
  public GherkinTableHeaderRowImpl(@NotNull final ASTNode node) {
    super(node);
  }

  @Override
  protected void acceptGherkin(GherkinElementVisitor gherkinElementVisitor) {
    gherkinElementVisitor.visitTableHeaderRow(this);
  }

  @Override
  public String toString() {
    return "GherkinTableHeaderRow";
  }
}