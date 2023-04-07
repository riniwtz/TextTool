package io.github.riniwtz;

import io.github.riniwtz.textpane.WrapEditorKit;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TextPane extends JTextPane {
    private static final int TEXT_PANE_INSETS = 10;
    private final Color DEFAULT_GAIN_FOCUS_BORDER_COLOR = Color.BLACK;
    private final Color DEFAULT_LOST_FOCUS_BORDER_COLOR = Color.GRAY;
    private int tabSpacing = 4;

    public TextPane() {
        // Text pane styling
        this.setEditorKit(new WrapEditorKit());
        this.setMargin(new Insets(TEXT_PANE_INSETS, TEXT_PANE_INSETS, TEXT_PANE_INSETS, TEXT_PANE_INSETS));

        // Creates new textpane keymap and adds custom tab spacing
        Keymap keymap = JTextComponent.getKeymap(JTextComponent.DEFAULT_KEYMAP);
        keymap.addActionForKeyStroke(KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0), new TabAction(tabSpacing));
        this.setKeymap(keymap);

        // Change scroll pane border color when text pane is clicked
        this.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                JScrollPane scrollPane = (JScrollPane) e.getComponent().getParent().getParent();
                scrollPane.setBorder(BorderFactory.createLineBorder(DEFAULT_GAIN_FOCUS_BORDER_COLOR, 2, true));
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                JScrollPane scrollPane = (JScrollPane) e.getComponent().getParent().getParent();
                scrollPane.setBorder(BorderFactory.createLineBorder(DEFAULT_LOST_FOCUS_BORDER_COLOR, 2, true));
            }
        });

        // Add UNDO / REDO feature
        UndoManager undoManager = new UndoManager();
        this.getDocument().addUndoableEditListener(undoManager);

        this.addKeyListener(new KeyAdapter() {
            private static final int KEY_CODE_Z = KeyEvent.VK_Z;
            private boolean undo(KeyEvent e) {
                return ((e.isMetaDown() || e.isControlDown()) && !e.isShiftDown() && e.getKeyCode()  == KEY_CODE_Z);
            }
            private boolean redo(KeyEvent e) {
                return ((e.isMetaDown() || e.isControlDown()) && e.isShiftDown() && e.getKeyCode() == KEY_CODE_Z);
            }
            @Override
            public void keyPressed(KeyEvent e) {
                if (undo(e)) if (undoManager.canUndo()) undoManager.undo();
                if (redo(e)) if (undoManager.canRedo()) undoManager.redo();
            }
        });
    }
}
