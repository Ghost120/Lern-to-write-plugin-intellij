package ru.sbt.qa.customLanguage.registeringFileType;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.nio.charset.Charset;


/**
 * Created by asus 123 on 19.05.2017.
 */
public class GherkinFileType extends LanguageFileType {

    public static final GherkinFileType INSTANCE = new GherkinFileType();

    protected GherkinFileType() {
        super(GherkinLanguage.INSTANCE);
    }
    @NotNull
    public String getName() {
        return "Cucumber";
    }

    @NotNull
    public String getDescription() {
        return "Cucumber scenario files";
    }

    @NotNull
    public String getDefaultExtension() {
        return "feature";
    }

    public Icon getIcon() {
        return CucumberIcons.Cucumber;
    }
}
