import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo { // Renamed to avoid shadowing java.awt.GridLayout

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("GridLayout Demo");

            JPanel keypad = new JPanel();
            // Now correctly references java.awt.GridLayout
            keypad.setLayout(new GridLayout(4, 3, 8, 8));
            keypad.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

            String[] labels={"1","2","3","4","5","6","7","8","9","#","0","*"};

            for(String text:labels)
            {
                JButton b=new JButton(text);
                b.setFont(b.getFont().deriveFont(Font.BOLD,22f));
                keypad.add(b);
            }
            JLabel title=new JLabel("keypad - resize the window",SwingConstants.CENTER);
            title.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
            frame.add(title,BorderLayout.NORTH);
            frame.add(keypad,BorderLayout.CENTER);



            frame.setSize(320, 420);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}