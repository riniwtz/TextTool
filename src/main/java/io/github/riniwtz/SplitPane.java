package io.github.riniwtz;

import javax.swing.*;

public class SplitPane extends JSplitPane {
    public SplitPane() {
        this.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        this.setContinuousLayout(true);
        this.setLeftComponent(new ScrollPane());
        this.setRightComponent(new ScrollPane());
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setDividerSize(10);
    }
}
