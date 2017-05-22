package ru.sbt.qa.customLanguage.impl;

import ru.sbt.qa.customLanguage.syntaxHiglighting.GherkinPsiElement;
import ru.sbt.qa.customLanguage.syntaxHiglighting.GherkinTable;

/**
 * @author yole
 */
public interface GherkinExamplesBlock extends GherkinPsiElement {
  GherkinTable getTable();
}
