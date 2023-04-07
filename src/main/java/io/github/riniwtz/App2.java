package io.github.riniwtz;

import javax.swing.*;

public class App2 {

    public static final String TITLE = "TextTools";
    public static final String OPERATING_SYSTEM = System.getProperty("os.name").toLowerCase();
    private Window2 window;

    public void start() {
        window = new Window2();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App2().start());
    }

    public Window2 getWindow() {
        return window;
    }
}
