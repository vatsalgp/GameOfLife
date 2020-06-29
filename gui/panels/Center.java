package life.gui.panels;

import life.core.Matrix;
import javax.swing.*;
import java.awt.*;

public class Center extends JPanel {
    private static final long serialVersionUID = -2192278565339242054L;

    public Center(final Matrix matrix) {
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