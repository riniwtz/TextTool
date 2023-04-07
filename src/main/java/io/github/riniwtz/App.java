//
//package io.github.riniwtz;
//
//import io.github.riniwtz.ui.CustomComboBoxUI;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class App {
//    public static final String APP_TITLE = "TextTools";
//
//    private void createFontLoader() {
//        // Load fonts to font box
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        fontBox = new JComboBox<>(fonts);
//
//        // Add font label
//        JLabel fontLabel = new JLabel("Font");
//        panel.add(fontLabel, "wrap");
//
//
////        // FontChooser
////        fontBox.addActionListener(e -> {
////            System.out.println(fontBox.getSelectedItem());
////            Font font = new Font((String) fontBox.getSelectedItem(), Font.PLAIN, 12);
////            // Change First Text Area Font
////
////            textArea.setFont(font);
////            tln.setFont(font);
////
////
////            if (textArea.getSelectedText() != null) {
////                System.out.println("text selected");
////                textArea.setSelectionStart(textArea.getSelectionStart());
////                textArea.setSelectionEnd(textArea.getSelectionEnd());
////                textArea.setFont(font);
////                System.out.println(textArea.getSelectionStart());
////                System.out.println(textArea.getSelectionEnd());
////            }
////        });
//        panel.add(fontBox);
//    }
//
//    private void createFontSizeBoxComponent() {
//        JLabel fontSizeLabel = new JLabel("Font size");
//        panel.add(fontSizeLabel);
//        JComboBox<String> fontSizeBox = new JComboBox<>();
//        fontSizeBox.addItem("5 pt");
//        fontSizeBox.addItem("5.5 pt");
//        fontSizeBox.addItem("6.5 pt");
//        fontSizeBox.addItem("7.5 pt");
//        fontSizeBox.addItem("8 pt");
//        fontSizeBox.addItem("9 pt");
//        fontSizeBox.addItem("10 pt");
//        fontSizeBox.addItem("10.5 pt");
//        fontSizeBox.addItem("11 pt");
//        fontSizeBox.addItem("12 pt");
//        fontSizeBox.addItem("14 pt");
//        fontSizeBox.addItem("16 pt");
//        fontSizeBox.addItem("18 pt");
//        fontSizeBox.addItem("20 pt");
//        fontSizeBox.addItem("22 pt");
//        fontSizeBox.addItem("24 pt");
//        fontSizeBox.addItem("26 pt");
//        fontSizeBox.addItem("28 pt");
//        fontSizeBox.addItem("36 pt");
//        fontSizeBox.addItem("48 pt");
//        fontSizeBox.addItem("72 pt");
//        fontSizeBox.setEditable(true);
//        fontSizeBox.setUI(new CustomComboBoxUI());
//        panel.add(fontSizeBox);
//    }
//
//    private void debug() {
//        JButton debugButton = new JButton("debug");
//        debugButton.addActionListener(e -> {
//            System.out.println("first select: " + textPane.getSelectionStart());
//            System.out.println("end select: " + textPane.getSelectionEnd());
//        });
//        panel.add(debugButton);
//    }
//
//    private void loadWindow() {
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new Window());
//    }
//}