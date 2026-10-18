
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class task5 {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            // Create the frame
            JFrame frame = new JFrame("Login");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            // Main panel with BorderLayout
            JPanel mainPanel = new JPanel(new BorderLayout(10, 15));
            mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

            // Heading at the top (NORTH)
            JLabel heading = new JLabel("Student Login", JLabel.CENTER);
            heading.setFont(new Font("SansSerif", Font.BOLD, 22));
            mainPanel.add(heading, BorderLayout.NORTH);

            // Center panel for username and password
            JPanel formPanel = new JPanel(new GridLayout(2, 2, 10, 15));

            JLabel userLabel = new JLabel("Username:");
            JTextField userField = new JTextField(15);

            JLabel passLabel = new JLabel("Password:");
            JPasswordField passField = new JPasswordField(15);

            formPanel.add(userLabel);
            formPanel.add(userField);
            formPanel.add(passLabel);
            formPanel.add(passField);

            mainPanel.add(formPanel, BorderLayout.CENTER);

            // Button panel at the bottom (SOUTH)
            JPanel buttonPanel = new JPanel(
                    new FlowLayout(FlowLayout.CENTER, 10, 5)
            );

            JButton loginButton = new JButton("Login");
            JButton cancelButton = new JButton("Cancel");

            buttonPanel.add(loginButton);
            buttonPanel.add(cancelButton);

            mainPanel.add(buttonPanel, BorderLayout.SOUTH);

            // Add the main panel to the frame
            frame.add(mainPanel);

            // Adjust window size to fit components
            frame.pack();

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
