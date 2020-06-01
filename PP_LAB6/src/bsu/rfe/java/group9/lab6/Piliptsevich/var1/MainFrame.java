package bsu.rfe.java.group9.lab6.Piliptsevich.var1;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {
    private static final int WIDTH = 700;
    private static final int HEIGHT = 500;
    private JMenuItem pauseMenuItem;
    private JMenuItem pauseBigMenuItem;
    private JMenuItem resumeMenuItem;
    private Field field = new Field();

    public MainFrame() {
        super("Программирование и синхронизация потоков"); setSize(WIDTH, HEIGHT);
        Toolkit kit = Toolkit.getDefaultToolkit();
        setLocation((kit.getScreenSize().width - WIDTH)/2,
                (kit.getScreenSize().height - HEIGHT)/2);
        setExtendedState(MAXIMIZED_BOTH);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu ballMenu = new JMenu("Мячи");
        Action addBallAction = new AbstractAction("Добавить мяч") {
            public void actionPerformed(ActionEvent event) {
                field.addBall();
                if (!pauseBigMenuItem.isEnabled() && !pauseMenuItem.isEnabled() && !resumeMenuItem.isEnabled()) {
                    pauseMenuItem.setEnabled(true);
                    pauseBigMenuItem.setEnabled(true);
                } }
        };
        menuBar.add(ballMenu);
        ballMenu.add(addBallAction);
        JMenu controlMenu = new JMenu("Управление");
        menuBar.add(controlMenu);

        //  pause
        Action pauseAction = new AbstractAction("Приостановить движение"){
            public void actionPerformed(ActionEvent event) {
                field.pause();
                pauseMenuItem.setEnabled(false);
                pauseBigMenuItem.setEnabled(false);
                resumeMenuItem.setEnabled(true);
            } };
        pauseMenuItem = controlMenu.add(pauseAction);
        pauseMenuItem.setEnabled(false);

        // pause большие мячи
        Action pauseBigAction = new AbstractAction("Приостановить движение мячей большого радиуса"){
            public void actionPerformed(ActionEvent event) {
                field.pauseBig();
                pauseBigMenuItem.setEnabled(false);
                resumeMenuItem.setEnabled(true);
            } };
        pauseBigMenuItem = controlMenu.add(pauseBigAction);
        pauseMenuItem.setEnabled(false);
        pauseBigMenuItem.setEnabled(false);

        // resume
        Action resumeAction = new AbstractAction("Возобновить движение") {
            public void actionPerformed(ActionEvent event) {
                field.resume();
                pauseMenuItem.setEnabled(true);
                pauseBigMenuItem.setEnabled(true);
                resumeMenuItem.setEnabled(false);
            } };
        resumeMenuItem = controlMenu.add(resumeAction);
        resumeMenuItem.setEnabled(false);
        getContentPane().add(field, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}