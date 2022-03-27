package actions;


import classes.file;
import classes.pop;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Hello extends AnAction {

    protected static final String EXTENT = ".txt";


   // FileNameExtensionFilter filt = new FileNameExtensionFilter()
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
       // Messages.showInfoMessage("Hi", "Trying");
       // file.showSaveDialog(frame.getFrame());
     //   final Editor editor = e.getRequiredData(CommonDateKeys.EDITOR);

        file f = new file();
        f.actionPerformed(null);
        //pop pop = new pop();
   // pop.show();

    }
}
