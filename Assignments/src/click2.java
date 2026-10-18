import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class click2 implements ActionListener {
    private static int count = 0;
    public static void main()
    {
        JFrame frame=new JFrame("Clickcounter");
        JLabel label=new JLabel("0");
        JButton b1=new JButton("Set ");
        JButton b2=new JButton("Reset");


        b1.addActionListener(e ->
                label.setText("Lambda: " + (++count))
        );
        b1.addActionListener(e ->
                label.setText(" ")
        );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
