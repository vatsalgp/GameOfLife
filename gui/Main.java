package life.gui;

import life.core.Matrix;
import life.gui.panels.Center;
import life.gui.panels.North;
import javax.swing.*;

import java.awt.*;

public class Main extends JPanel {
    private static final long serialVersionUID = 5620334458224357720L;

    public Main(final int i, final Matrix matrix) {
        setLayout(new BorderLayout());
        add(new North(i, matrix.getAlive()), BorderLayout.NORTH);
        add(new Center(matrix), BorderLayout.CENTER);
    }
}