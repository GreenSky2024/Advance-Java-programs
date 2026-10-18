import javax.swing.*;
import java.awt.*;

public class Task2nd {
    private static JLabel detailLable(String text){
        JLabel lable=new JLabel(text);
        lable.setFont(new Font("MonoSpaced",Font.PLAIN,16));
        lable.setForeground(Color.black);
        return lable;
    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(()->
        {
            JFrame frame=new JFrame("My Visiting Card");
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JLabel name=new JLabel("Mayur Hiray",SwingConstants.CENTER);
            name.setFont(new Font("Arial", Font.BOLD, 28));
            name.setForeground(Color.WHITE);
            name.setOpaque(true);
            name.setBackground(Color.BLUE);
            name.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

            JPanel details=new JPanel(new GridLayout(3,1,0,8));
            details.setBackground(Color.LIGHT_GRAY);
            details.add(detailLable("Role: Java Developer"));
            details.add(detailLable("E-Mail: mashhd@gmail.com"));
            details.add(detailLable("Phone: 232231651611 "));
            details.setBorder(BorderFactory.createEmptyBorder(8,18,8,18));
            //South
            JLabel footer=new JLabel("Pune, Maharashtra",SwingConstants.CENTER);
            footer.setFont(new Font("Arial", Font.BOLD, 28));
            footer.setForeground(Color.WHITE);
            footer.setOpaque(true);
            footer.setBackground(Color.lightGray);
            footer.setBorder(BorderFactory.createEmptyBorder(8,18,8,18));

            frame.setLayout(new BorderLayout());
            frame.add(name,BorderLayout.NORTH);
            frame.add(details,BorderLayout.CENTER);
            frame.add(footer,BorderLayout.SOUTH);
            frame.setVisible(true);
        });
    }
}
