package life;

import javax.swing.*;

public class NorthPanel extends JPanel {
    private static final long serialVersionUID = -5927080304365417281L;

    public NorthPanel(int gen, int alive) {
        add(createGenerationLabel(gen));
        add(createAliveLabel(alive));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    private JLabel createAliveLabel(int alive) {
        JLabel aliveLabel = new JLabel("Alive: " + alive);
        aliveLabel.setName("AliveLabel");
        return aliveLabel;
    }

    private JLabel createGenerationLabel(int gen) {
        JLabel generationLabel = new JLabel("Generation #" + gen);
        generationLabel.setName("GenerationLabel");
        return generationLabel;
    }
}