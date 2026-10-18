import javax.swing.*;

public class helloSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->
        {
            JFrame f=new JFrame("Window");
            f.setSize(400,250);
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JLabel lable=new JLabel("Mayur Hiray",SwingConstants.CENTER);
            f.add(lable);
            f.setVisible(true);
        });
    }
}
