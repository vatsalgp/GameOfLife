package life;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private static final long serialVersionUID = 5620334458224357720L;

    public MainPanel(int i, Matrix matrix) {
        setLayout(new BorderLayout());
        add(new NorthPanel(i, matrix.getAlive()), BorderLayout.NORTH);
        add(new CenterPanel(matrix), BorderLayout.CENTER);
    }
}