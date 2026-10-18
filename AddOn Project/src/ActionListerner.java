
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ActionListerner extends JFrame implements ActionListener {

    private static int count = 0;
    private static JLabel label;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Event Handling Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        JButton b1 = new JButton("Anonymous Class");
        JButton b2 = new JButton("Lambda");
        JButton b3 = new JButton("Method Reference");

        // Initialize the class-level label
        label = new JLabel("Clicks: 0");

        // 1. Anonymous class
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Anonymous: " + (++count));
            }
        });

        // 2. Lambda expression
        b2.addActionListener(e ->
                label.setText("Lambda: " + (++count))
        );

        // 3. Method reference
        b3.addActionListener(ActionListerner::reset);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(label);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Method reference handler
    private static void reset(ActionEvent e) {
        count = 0;
        label.setText("Clicks: " + count);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Not required because individual listeners handle the buttons.
    }
}
