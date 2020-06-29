package life;

import javax.swing.*;
import java.awt.*;

public class GameOfLife extends JFrame {
    private static final long serialVersionUID = 9145501200064594952L;

    public GameOfLife() {
        super("Game of Life");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setSize(600, 600);
        showPanel();
    }

    private void showPanel() {
        int gen = 10;
        Matrix matrix = new Matrix(10);
        matrix.init();
        for (int i = 1; i <= gen; i++) {
            JPanel northPanel = new NorthPanel(i, matrix.getAlive());
            JPanel centerPanel = new CenterPanel(matrix);
            add(northPanel, BorderLayout.NORTH);
            add(centerPanel, BorderLayout.CENTER);
            setVisible(true);
            revalidate();
            repaint();
            sleep();
            remove(northPanel);
            remove(centerPanel);
            matrix = Universe.next(matrix);
        }
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}