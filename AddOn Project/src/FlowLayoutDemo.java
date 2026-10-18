
import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("FlowLayout Demo");

            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());

            panel.add(new JButton("One"));
            panel.add(new JButton("Two"));
            panel.add(new JButton("Three"));
            panel.add(new JButton("Four"));
            panel.add(new JButton("Five"));

            frame.add(panel);

            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
