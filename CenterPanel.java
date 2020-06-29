package life;

import javax.swing.*;

import java.awt.*;

public class CenterPanel extends JPanel {
    private static final long serialVersionUID = -2192278565339242054L;

    public CenterPanel(Matrix matrix) {
        int size = matrix.getSize();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                JPanel cell = new JPanel();
                cell.setBackground(matrix.matrix[i][j] ? Color.BLACK : Color.WHITE);
                add(cell);
            }
        }
        setBackground(Color.BLACK);
        setLayout(new GridLayout(size, size, 1, 1));
    }
}