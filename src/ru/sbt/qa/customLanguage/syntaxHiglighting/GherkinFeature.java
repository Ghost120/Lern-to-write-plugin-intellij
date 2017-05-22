package ru.sbt.qa.customLanguage.syntaxHiglighting;

/**
 * @author yole
 */
public interface GherkinFeature extends GherkinPsiElement, GherkinSuppressionHolder {
  String getFeatureName();
  GherkinStepsHolder[] getScenarios();
}
