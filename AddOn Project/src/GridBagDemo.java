import javax.swing.*;
import java.awt.*;

public class GridBagDemo {
    static void addRow(JPanel p,int row, String label,JComponent field){
        GridBagConstraints c=new GridBagConstraints();
        c.insets=new Insets(5,5,5,5);
        c.gridy=row;
        c.gridx=0;

        c.anchor=GridBagConstraints.EAST;
        p.add(new JLabel(label),c);
        c.gridx=1;
        c.weightx=1;

        c.fill=GridBagConstraints.HORIZONTAL;
        p.add(field,c);
    }
    public static void main(String[] args) {
       SwingUtilities.invokeLater(()->{
           JPanel p=new JPanel(new GridBagLayout());
           addRow(p,0,"Roll No:",new JTextField(15));
           addRow(p,1,"NAME:",new JTextField(15));
           addRow(p,2,  "Email :",new JTextField(15));

           JFrame f=new JFrame("GridBagLayout");
           f.setContentPane(p);
           f.pack();
           f.setLocationRelativeTo(null);
           f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           f.setVisible(true);
       });

    }
}
