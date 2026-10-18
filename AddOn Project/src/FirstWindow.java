import javax.swing.*;
import java.awt.*;

public class FirstWindow
{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{ //creaye UI Thread
            JFrame frame=new JFrame("My First Swing App");
            frame.setSize(400,250);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel lable=new JLabel("Hello, Swing!",
                    SwingConstants.CENTER);
            JComboBox<String> city = new JComboBox<>(new String[]{"Pune", "Mumbai"});
            frame.add(lable);
            frame.setVisible(true);
        });
    }
}