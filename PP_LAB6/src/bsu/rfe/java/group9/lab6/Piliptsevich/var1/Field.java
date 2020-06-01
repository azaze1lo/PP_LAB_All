package bsu.rfe.java.group9.lab6.Piliptsevich.var1;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Field extends JPanel {
    private boolean paused = false;
    private boolean isBigPause = false;
    // Динамический список скачущих мячей
    private ArrayList<BouncingBall> balls = new ArrayList<BouncingBall>(10);
    private Timer repaintTimer = new Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
            repaint();
        } });
    // BouncingBall
    public Field() {
        setBackground(Color.WHITE);
        repaintTimer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D canvas = (Graphics2D) g;
        for (BouncingBall ball: balls) {
            ball.paint(canvas);
        } }

    public void addBall() {
        balls.add(new BouncingBall(this));
    }

    public synchronized void pause() {
        paused = true;
    }

    public synchronized void pauseBig() {
        isBigPause = true;
    }

    public synchronized void resume() {
        paused = false;
        isBigPause = false;
        notifyAll();
    }

    public synchronized void canMove(BouncingBall ball) throws
            InterruptedException {
        if (isBigPause && !paused) {
            if (ball.isBig)
                wait();
        }
        else if (paused) wait();
    }}
