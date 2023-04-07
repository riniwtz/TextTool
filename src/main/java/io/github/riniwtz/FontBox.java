package io.github.riniwtz;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FontBox extends JComboBox<String> {
    public FontBox() {
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addAll(List.of(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames()));
        this.setModel(comboBoxModel);
    }
}
