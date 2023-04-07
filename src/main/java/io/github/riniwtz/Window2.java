package io.github.riniwtz;

import net.miginfocom.swing.MigLayout;


import javax.swing.*;

public class Window2 extends JFrame {
    private final JPanel mainPanel = new JPanel();
    private FontBox fontBox = new FontBox();
    private SplitPane splitPane = new SplitPane();

    public Window2() {
        initializeLookAndFeel();
        this.setContentPane(mainPanel);
        this.setTitle(App2.TITLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLayout(new MigLayout());
        launchComponents();

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void launchComponents() {
        if (App2.OPERATING_SYSTEM.contains("win")) {
            this.setJMenuBar(new MenuBar());
        } else if (App2.OPERATING_SYSTEM.contains("mac")){
            new MenuBar();
        }
        mainPanel.add(fontBox, "wrap");
        mainPanel.add(splitPane);
    }

    private void initializeLookAndFeel() {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    public FontBox getFontBox() {
        return fontBox;
    }

    public SplitPane getSplitPane() {
        return splitPane;
    }
}
