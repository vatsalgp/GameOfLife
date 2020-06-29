package life;

import life.core.Matrix;
import life.core.Universe;
import life.gui.Main;
import javax.swing.*;

public class GUI extends JFrame {
    private static final long serialVersionUID = 9145501200064594952L;

    public static void main(final String[] args) {
        new GUI();
    }

    private GUI() {
        super("Game of Life");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
        showPanel();
    }

    private void showPanel() {
        final int gen = 10;
        final int size = 10;
        Matrix matrix = new Matrix(size);
        matrix.init();
        for (int i = 1; i <= gen; i++) {
            final JPanel panel = new Main(i, matrix);
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
        } catch (final InterruptedException e) {
        }
    }
}