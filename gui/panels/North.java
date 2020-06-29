package life.gui.panels;

import javax.swing.*;

public class North extends JPanel {
    private static final long serialVersionUID = -5927080304365417281L;

    public North(final int gen, final int alive) {
        add(createGenerationLabel(gen));
        add(createAliveLabel(alive));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    private JLabel createAliveLabel(final int alive) {
        final JLabel aliveLabel = new JLabel("Alive: " + alive);
        aliveLabel.setName("AliveLabel");
        return aliveLabel;
    }

    private JLabel createGenerationLabel(final int gen) {
        final JLabel generationLabel = new JLabel("Generation #" + gen);
        generationLabel.setName("GenerationLabel");
        return generationLabel;
    }
}