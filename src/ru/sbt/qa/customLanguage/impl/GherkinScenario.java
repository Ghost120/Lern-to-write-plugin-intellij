package ru.sbt.qa.customLanguage.impl;

import ru.sbt.qa.customLanguage.syntaxHiglighting.GherkinStepsHolder;

/**
 * @author yole
 */
public interface GherkinScenario extends GherkinStepsHolder {
  boolean isBackground();
}
