import javax.swing.*;
import java.awt.*;

public class borderLayout2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
        JFrame f=new JFrame("BorderLayout");
        f.setLayout(new BorderLayout(100,50));
        f.add(new JButton("NORTH -toolbar"),BorderLayout.NORTH);
        f.add(new JButton("West -menu"),BorderLayout.WEST);
        f.add(new JButton("CENTER -table"),BorderLayout.CENTER);
        f.add(new JButton("East -somthing"),BorderLayout.EAST);

        f.setSize(480,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        });
    }
}
