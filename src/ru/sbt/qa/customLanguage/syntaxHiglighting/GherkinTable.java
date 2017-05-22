package ru.sbt.qa.customLanguage.syntaxHiglighting;

import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author yole
 */
public interface GherkinTable extends GherkinPsiElement {
  @Nullable
  GherkinTableRow getHeaderRow();
  List<GherkinTableRow> getDataRows();

  int getColumnWidth(int columnIndex);
}
