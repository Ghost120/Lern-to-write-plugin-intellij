package ru.sbt.qa.customLanguage.impl;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import ru.sbt.qa.customLanguage.syntaxHiglighting.GherkinElementVisitor;
import ru.sbt.qa.customLanguage.syntaxHiglighting.GherkinPsiElementBase;


/**
 * @author yole
 */
public class GherkinFeatureHeaderImpl extends GherkinPsiElementBase {
  public GherkinFeatureHeaderImpl(@NotNull final ASTNode node) {
    super(node);
  }

  @Override
  protected void acceptGherkin(GherkinElementVisitor gherkinElementVisitor) {
    gherkinElementVisitor.visitFeatureHeader(this);
  }

  @Override
  public String toString() {
    return "GherkinFeatureHeader";
  }
}
