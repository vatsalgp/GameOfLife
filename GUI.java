package life;

import life.gui.Main;
import life.core.*;
import javax.swing.*;

public class GUI extends JFrame {
    private static final long serialVersionUID = 1;

    public static void main(final String[] args) {
        new GUI();
    }

    private GUI() {
        super("Game of Life");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 1200);
        setVisible(true);
        showPanel();
    }

    private void showPanel() {
        Matrix matrix = new Matrix();
        matrix.init();
        while (true) {
            final JPanel panel = new Main(matrix);
            add(panel);
            revalidate();
            Sleep.sleep();
            remove(panel);
            matrix = Universe.next(matrix);
        }
    }
}