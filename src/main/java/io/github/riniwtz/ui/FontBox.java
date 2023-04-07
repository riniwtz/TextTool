//package io.github.riniwtz.ui;
//
//import io.github.riniwtz.Window;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class FontBox extends JComboBox<String> {
//    private JComboBox<String> fontBox = this;
//    private void loadModel() {
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        this.setModel(new DefaultComboBoxModel<>(fonts));
//    }
//
//    public FontBox() {
//
//        loadModel();
//        // Add font label
//        JLabel fontLabel = new JLabel("Font");
//        // Add to panel
//        panel.add(fontLabel, "wrap");
//    }
//}
