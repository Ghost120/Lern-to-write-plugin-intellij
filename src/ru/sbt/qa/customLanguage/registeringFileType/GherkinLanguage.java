package ru.sbt.qa.customLanguage.registeringFileType;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

/**
 * Created by asus 123 on 22.05.2017.
 */
public class GherkinLanguage extends Language {
    public static GherkinLanguage INSTANCE = new GherkinLanguage();

    public GherkinLanguage() {
        super("Gherkin");
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Gherkin";
    }
}
