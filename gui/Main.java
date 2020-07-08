package life.gui;

import life.core.Matrix;
import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    private static final long serialVersionUID = 1;

    public Main(final Matrix matrix) {
        final int size = matrix.getSize();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                final JPanel cell = new JPanel();
                cell.setBackground(matrix.matrix[i][j] ? Color.BLACK : Color.WHITE);
                add(cell);
            }
        }
        setBackground(Color.BLACK);
        setLayout(new GridLayout(size, size, 1, 1));
    }
}