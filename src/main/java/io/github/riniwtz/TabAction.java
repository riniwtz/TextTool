package io.github.riniwtz;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;

public class TabAction extends AbstractAction {

    private final int tabSpacing;

    public TabAction(int tabSpacing) {
        this.tabSpacing = tabSpacing;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JTextComponent textComponent = (JTextComponent)e.getSource();
        Document doc = textComponent.getDocument();
        int caretPosition = textComponent.getCaretPosition();
        try {
            // Insert four spaces
            doc.insertString(caretPosition, " ".repeat(tabSpacing), null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }
}
