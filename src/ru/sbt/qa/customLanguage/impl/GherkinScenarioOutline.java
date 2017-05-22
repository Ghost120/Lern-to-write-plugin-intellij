package ru.sbt.qa.customLanguage.impl;

import org.jetbrains.annotations.NotNull;
import ru.sbt.qa.customLanguage.syntaxHiglighting.GherkinStepsHolder;

import java.util.List;

/**
 * @author yole
 */
public interface GherkinScenarioOutline extends GherkinStepsHolder {
  @NotNull
  List<GherkinExamplesBlock> getExamplesBlocks();
}
