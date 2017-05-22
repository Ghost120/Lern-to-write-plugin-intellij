package ru.sbt.qa.customLanguage.registeringFileType;

import com.intellij.openapi.util.IconLoader;
import javax.swing.*;

/**
 * Created by asus 123 on 22.05.2017.
 */
public class CucumberIcons {
    private static Icon load(String path) {
        return IconLoader.getIcon(path, CucumberIcons.class);
    }

    public static final Icon Cucumber = load("/icons/CoolImage.png"); // 16x16
    public static final Icon Steps_group_closed = load("/icons/steps_group_closed.png"); // 16x16
    public static final Icon Steps_group_opened = load("/icons/steps_group_opened.png"); // 16x16
}
