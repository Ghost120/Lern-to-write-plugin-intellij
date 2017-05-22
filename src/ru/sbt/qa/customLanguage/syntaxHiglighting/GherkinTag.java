package ru.sbt.qa.customLanguage.syntaxHiglighting;

public interface GherkinTag extends GherkinPsiElement {
  GherkinTag[] EMPTY_ARRAY = new GherkinTag[0];

  public String getName();
}
