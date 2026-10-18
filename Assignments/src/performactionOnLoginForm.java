/*
Task: a login window with a heading, username field, password field, Login and Cancel buttons.
 The window must not be resizable. • Must include: JPasswordField, a button panel using FlowLayout,
 setResizable(false), pack(). • Hint: nest the button panel in the SOUTH of the frame.
 */
import javax.swing.*;
import java.awt.*;

class LoginWindow {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("Login");
            frame.setLayout(new BorderLayout(10, 10));

            JLabel heading = new JLabel("User Login", JLabel.CENTER);
            heading.setFont(new Font("Arial", Font.BOLD, 24));
            heading.setBorder(
                    BorderFactory.createEmptyBorder(15, 10, 10, 10));

            JPanel form = new JPanel(new GridLayout(2, 2, 10, 10));
            form.setBorder(
                    BorderFactory.createEmptyBorder(10, 20, 10, 20));

            JLabel userLabel = new JLabel("Username:");
            JTextField username = new JTextField(15);

            JLabel passLabel = new JLabel("Password:");
            JPasswordField password = new JPasswordField(15);

            form.add(userLabel);
            form.add(username);
            form.add(passLabel);
            form.add(password);

            // Buttons
            JButton login = new JButton("Login");

            // 🌟 Added: Credentials validation logic
            login.addActionListener(e -> {
                String inputUser = username.getText();
                // JPasswordField returns a char array for security, convert it to a String
                String inputPass = new String(password.getPassword());

                // Check credentials (Username: admin, Password: 1234)
                if (inputUser.equals("admin") && inputPass.equals("1234")) {
                    heading.setForeground(new Color(0, 128, 0)); // Change text to green
                    heading.setText("Login Successful! 🎉");
                } else {
                    heading.setForeground(Color.RED); // Change text to red
                    heading.setText("Login Failed");

                    // Show a popup error message
                    JOptionPane.showMessageDialog(frame,
                            "Invalid Username or Password!",
                            "Login Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            });

            JButton cancel = new JButton("Cancel");

            // Clears fields and resets heading text/color when Cancel is clicked
            cancel.addActionListener(e -> {
                username.setText("");
                password.setText("");
                heading.setForeground(Color.BLACK); // Reset text color to default
                heading.setText("User Login");
            });

            JPanel buttonPanel = new JPanel(
                    new FlowLayout(FlowLayout.CENTER, 10, 10));

            buttonPanel.add(login);
            buttonPanel.add(cancel);

            frame.add(heading, BorderLayout.NORTH);
            frame.add(form, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setResizable(false);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}