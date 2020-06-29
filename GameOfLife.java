package life;

import javax.swing.*;

public class GameOfLife extends JFrame {
    private static final long serialVersionUID = 9145501200064594952L;

    public GameOfLife() {
        super("Game of Life");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
        showPanel();
    }

    private void showPanel() {
        int gen = 10;
        int size = 10;
        Matrix matrix = new Matrix(size);
        matrix.init();
        for (int i = 1; i <= gen; i++) {
            JPanel panel = new MainPanel(i, matrix);
            add(panel);
            revalidate();
            sleep();
            remove(panel);
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