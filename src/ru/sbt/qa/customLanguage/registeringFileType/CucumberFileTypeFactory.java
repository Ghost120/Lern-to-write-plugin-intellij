package ru.sbt.qa.customLanguage.registeringFileType;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by asus 123 on 22.05.2017.
 */
public class CucumberFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(GherkinFileType.INSTANCE, "feature");
    }
}
