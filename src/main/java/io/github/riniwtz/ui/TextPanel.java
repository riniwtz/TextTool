//package io.github.riniwtz.ui;
//
//import io.github.riniwtz.Window;
//import io.github.riniwtz.textpane.TextLineNumber;
//import io.github.riniwtz.textpane.WrapEditorKit;
//
//import javax.swing.*;
//import javax.swing.event.DocumentEvent;
//import javax.swing.event.DocumentListener;
//import javax.swing.event.PopupMenuEvent;
//import javax.swing.event.PopupMenuListener;
//import javax.swing.text.SimpleAttributeSet;
//import javax.swing.text.StyleConstants;
//import javax.swing.text.StyledDocument;
//import java.awt.*;
//import java.awt.event.ActionListener;
//
//public class TextPanel extends Window {
//    private JTextPane textPane;
//    protected final int TEXT_PANE_DEFAULT_WIDTH = 500;
//    protected final int TEXT_PANE_DEFAULT_HEIGHT = 500;
//    protected final int TEXT_PANE_INSETS = 10;
//    protected final int TEXT_PANE_VERTICAL_SCROLLING_INCREMENT = 6;
//    private JScrollPane scrollPane;
//    private JScrollPane scrollPane2;
//    private JScrollPane firstScrollPane;
//    private TextLineNumber tln;
//    private TextLineNumber tln2;
//    protected int globalFontSize = 11;
//
//    private static final String DOCUMENT_DEFAULT_FONT_FAMILY = "Calibri";
//    private static final int DOCUMENT_DEFAULT_FONT_STYLE = Font.PLAIN;
//    private static final int DOCUMENT_DEFAULT_FONT_SIZE = 12;
//    private Font currentFontFamily = new Font("Calibri", DOCUMENT_DEFAULT_FONT_STYLE, DOCUMENT_DEFAULT_FONT_SIZE);
//    private int currentFontStyle;
//    private int currentFontSize;
//
//    public TextPanel() {
//        // Text panes are used than text areas for additional text styles capabilities
//        textPane = new JTextPane();
//
//        // Add a first scroll pane to first text pane
//        firstScrollPane = new JScrollPane(textPane, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        firstScrollPane.setPreferredSize(new Dimension(TEXT_PANE_DEFAULT_WIDTH, TEXT_PANE_DEFAULT_HEIGHT));
//
//        // Add text pane styles
//        addTextPaneStyles(textPane);
//
//        // Add component to window
//        panel.add(firstScrollPane);
//    }
//
//    /*
//     * Conditions
//     * - It will the select the font family of the character when clicked or moved by arrows
//     * - It can change the font or properties of selected text
//     *
//     */
//    private void addTextPaneStyles(JTextPane textPane) {
//        // Add word-wrapping support for text pane
//        textPane.setEditorKit(new WrapEditorKit());
//        // Add border margins to text pane
//        textPane.setMargin(new Insets(TEXT_PANE_INSETS, TEXT_PANE_INSETS, TEXT_PANE_INSETS, TEXT_PANE_INSETS));
//        // Add vertical smooth scrolling
//        firstScrollPane.getVerticalScrollBar().setUnitIncrement(TEXT_PANE_VERTICAL_SCROLLING_INCREMENT);
//        // Add line numbers to scroll pane
//        tln = new TextLineNumber(textPane);
//        firstScrollPane.setRowHeaderView(tln);
//        // Add default text pane font
//        textPane.setFont(Font.decode("Arial"));
//
//
//        // Change font of selected text from the font box
//        ActionListener textSelectionFontChangeListener = e -> {
//            // Retrieves the font selected on combo box by the user
//            // Decodes the selected font to get font style information
//            // ONLY CHANGE THE FONT FAMILY
//            Font font = Font.decode((String) fontBox.getSelectedItem());
//            //currentFont = new Font(font.getFamily(), DOCUMENT_DEF, font.getSize());
//
//
//
//
//            // Gets the document representation of the text pane
//            StyledDocument selectedText = textPane.getStyledDocument();
//            // Gets the length and starting position of selected text
//            int start = textPane.getSelectionStart();
//            int length = textPane.getSelectionEnd() - start;
//
//            // Made a SimpleAttributeSet object and add to it for setCharacterAttributes
//            SimpleAttributeSet textSelectionAttribute = new SimpleAttributeSet();
//            textSelectionAttribute.addAttribute(StyleConstants.FontFamily, font.getFamily());
//
//            // Apply the new attributes to the selected text
//            selectedText.setCharacterAttributes(start, length, textSelectionAttribute, true);
//
//            int caretPos = textPane.getCaretPosition();
//            textPane.getStyledDocument().setCharacterAttributes(caretPos, 1, textSelectionAttribute, true);
//
//            // Lose focus after item selection
//            fontBox.setFocusable(false);
//        };
//
//        // Disable textSelectionFontChangeListener when font box is not used to prevent feature conflicts
//        fontBox.addPopupMenuListener(new PopupMenuListener() {
//            @Override
//            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
//                fontBox.addActionListener(textSelectionFontChangeListener);
//            }
//            @Override
//            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
//                fontBox.removeActionListener(textSelectionFontChangeListener);
//                textPane.getCaret().setVisible(true);
//                textPane.getCaret().setSelectionVisible(true);
//            }
//            @Override
//            public void popupMenuCanceled(PopupMenuEvent e) {}
//        });
//
//        // Match the selected font when user types
//        textPane.getDocument().addDocumentListener(new DocumentListener() {
//            @Override
//            public void insertUpdate(DocumentEvent e) {
//                SimpleAttributeSet fontAttrs = new SimpleAttributeSet();
//                int start = e.getOffset();
//                int length = e.getLength();
//            }
//
//            @Override
//            public void removeUpdate(DocumentEvent e) {}
//
//            @Override
//            public void changedUpdate(DocumentEvent e) {}
//        });
//
//
//        // Add font box updater when text is clicked or selected
////        textPane.addCaretListener(new CaretListener() {
////            @Override
////            public void caretUpdate(CaretEvent e) {
////                // Get character location
////                int pos = e.getDot();
////                // Get document styling information from JTextPane
////                StyledDocument doc = textPane.getStyledDocument();
////                // Transfers character to element object
////                Element element = doc.getCharacterElement(pos - 1);
////                // Get all attributes of character styles
////                AttributeSet attributes = element.getAttributes();
////                // Get the font family name of the identified font
////                String fontName = StyleConstants.getFontFamily(attributes);
////                // Automatically updates the box to the identified font
////                fontBox.setSelectedItem(fontName);
////
////            }
////        });
//
////
//
//    }
//}
