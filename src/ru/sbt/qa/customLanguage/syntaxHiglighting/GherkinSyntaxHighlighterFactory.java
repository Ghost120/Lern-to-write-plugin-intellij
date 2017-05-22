package ru.sbt.qa.customLanguage.syntaxHiglighting;


import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Kasyanenko Konstantin
 * on 22.05.2017.
 */
public class GherkinSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

    @NotNull
    @Override
    public SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
        return new GherkinSyntaxHighlighter(ru.sbt.qa.customLanguage.i18n.JsonGherkinKeywordProvider.getKeywordProvider());
    }
}
