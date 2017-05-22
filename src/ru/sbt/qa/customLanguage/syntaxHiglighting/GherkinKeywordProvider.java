package ru.sbt.qa.customLanguage.syntaxHiglighting;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

/**
 * Created Kasyanenko Konstantin
 * on 22.05.2017
 */
public interface GherkinKeywordProvider {
    Collection<String> getAllKeywords(String language);
    IElementType getTokenType(String language, String keyword);
    String getBaseKeyword(String language, String keyword);
    boolean isSpaceAfterKeyword(String language, String keyword);
    boolean isStepKeyword(String keyword);
    @NotNull
    GherkinKeywordTable getKeywordsTable(@Nullable String language);
}
