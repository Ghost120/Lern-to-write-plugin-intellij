package ru.sbt.qa.customLanguage.syntaxHiglighting;

import com.intellij.psi.PsiFile;

import java.util.List;

/**
 * @author yole
 */
public interface GherkinFile extends PsiFile {
  List<String> getStepKeywords();

  String getLocaleLanguage();

  GherkinFeature[] getFeatures();
}
