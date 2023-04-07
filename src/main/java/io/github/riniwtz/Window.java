//package io.github.riniwtz;
//
//import io.github.riniwtz.ui.FontBox;
//import io.github.riniwtz.ui.ViewportPanel;
//import net.miginfocom.swing.MigLayout;
//
//import javax.swing.*;
//
//public class Window {
//
//    protected JFrame frame;
//    protected JPanel panel;
//
//    private void initializeLookAndFeel() {
//        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void createWindow() {
//        initializeLookAndFeel();
//        frame = new JFrame();
//        frame.setTitle(App.APP_TITLE);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(true);
//        frame.setLayout(new MigLayout());
//    }
//
//    private void launchComponents() {
//        new ViewportPanel();
//        new FontBox();
//
//    }
//
//    public Window() {
//        createWindow();
//        launchComponents();
//    }
//}
