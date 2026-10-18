
import javax.swing.*;
import java.awt.*;

public class Task5_1 {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            // Create the frame
            JFrame frame = new JFrame("Student Login");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            // Create text fields
            JTextField userfield = new JTextField(15);
            JPasswordField passwordField = new JPasswordField(15);

            // Create form panel using GridBagLayout
            JPanel form = new JPanel(new GridBagLayout());
            form.setBorder(
                    BorderFactory.createEmptyBorder(10, 25, 5, 25)
            );

            // Add username and password rows
            addRow(form, 0, "Username:", userfield);
            addRow(form, 1, "Password:", passwordField);

            // Create heading
            JLabel heading = new JLabel(
                    "Student Login", SwingConstants.CENTER
            );
            heading.setFont(new Font("SansSerif", Font.BOLD, 22));

            // Create button panel
            JButton login = new JButton("Login");
            JButton cancel = new JButton("Cancel");

            JPanel buttonPanel = new JPanel(
                    new FlowLayout(FlowLayout.CENTER, 10, 5)
            );

            buttonPanel.add(login);
            buttonPanel.add(cancel);

            // Create main panel
            JPanel mainPanel = new JPanel(new BorderLayout(10, 15));
            mainPanel.setBorder(
                    BorderFactory.createEmptyBorder(15, 15, 15, 15)
            );

            mainPanel.add(heading, BorderLayout.NORTH);
            mainPanel.add(form, BorderLayout.CENTER);
            mainPanel.add(buttonPanel, BorderLayout.SOUTH);

            // Add main panel to frame
            frame.add(mainPanel);

            // Fit window to components
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    // Method to add a label and field using GridBagLayout
    private static void addRow(
            JPanel panel, int row, String text, JComponent field) {

        GridBagConstraints gbc = new GridBagConstraints();

        // Label constraints
        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 10);

        panel.add(new JLabel(text), gbc);

        // Field constraints
        gbc.gridx = 1;
        gbc.gridy = row;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.insets = new Insets(5, 5, 5, 5);

        panel.add(field, gbc);
    }
}
