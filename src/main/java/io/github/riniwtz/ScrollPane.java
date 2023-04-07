package io.github.riniwtz;

import io.github.riniwtz.textpane.TextLineNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ScrollPane extends JScrollPane {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 300;

    public ScrollPane() {
        TextPane textPane = new TextPane();
        this.setViewportView(textPane);
        this.setRowHeaderView(new TextLineNumber(textPane));
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
    }
}
