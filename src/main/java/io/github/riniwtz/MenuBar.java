package io.github.riniwtz;

import com.apple.eawt.Application;

import javax.swing.*;

public class MenuBar extends JMenuBar {
    public MenuBar() {
        Application application = Application.getApplication();
        application.setDefaultMenuBar(this);

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu textMenu = new JMenu("Text");
        this.add(fileMenu);
        this.add(editMenu);
        this.add(textMenu);

        JMenuItem sortTextItem = new JMenuItem("Sort Lines");
        textMenu.add(sortTextItem);
    }
}
