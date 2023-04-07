package io.github.riniwtz.ui;

import javax.swing.*;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.*;

public class CustomComboBoxUI extends BasicComboBoxUI {

    public static ComboBoxUI createUI(JComponent c) {
        return new CustomComboBoxUI();
    }

    @Override
    protected JButton createArrowButton() {
        // Override the arrow button to change its appearance
        JButton arrowButton = new JButton();
        arrowButton.setPreferredSize(new Dimension(20, 20));
        arrowButton.setOpaque(true);
        arrowButton.setBackground(Color.WHITE);
        arrowButton.setForeground(Color.BLACK);
        arrowButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return arrowButton;
    }

    @Override
    protected ComboPopup createPopup() {
        // Override the combo popup to change its appearance
        BasicComboPopup popup = (BasicComboPopup) super.createPopup();
        popup.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return popup;
    }
}

