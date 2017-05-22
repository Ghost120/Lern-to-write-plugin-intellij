package ru.sbt.qa.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by asus 123 on 15.05.2017.
 */
public class MyActoin extends AnAction {
    public MyActoin(){
        super("Text _Boxes");
    }
    @Override
    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        String str = Messages.showInputDialog(project, "What is yor name", "Input your name", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello, " +str + "!\n I am glad to see you.", "Information", Messages.getInformationIcon());
    }
}
