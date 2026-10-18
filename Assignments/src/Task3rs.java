    import org.w3c.dom.Text;

    import javax.swing.*;
    import java.awt.*;

    public class Task3rs {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(()->
            {
                JTextField nameFiled=new JTextField(15);
                JTextField emailField=new JTextField(15);
                JComboBox<String>branchBox=new JComboBox<>(new String[]{"CSE","IT","ECE","EEE","MECH"});

                JRadioButton male=new JRadioButton("Male");
                JRadioButton female=new JRadioButton("Female");
                JRadioButton other=new JRadioButton("Other");

                ButtonGroup genderGroup=new ButtonGroup();

                genderGroup.add(male);
                genderGroup.add(female);
                genderGroup.add(other);

                JPanel genderPanel=new JPanel(new FlowLayout(
                        FlowLayout.LEFT,5,0));
                genderPanel.add(male);
                genderPanel.add(female);
                genderPanel.add(other);

                JCheckBox hostel=new JCheckBox("Lives in hoestel");
                JButton sumbit=new JButton("Sumbit");

                JPanel form=new JPanel(new GridLayout(0,2,10,10));
                form.setBorder(BorderFactory.createEmptyBorder(28,20,20,20));
                form.add(new JLabel("Name: "));
                form.add(nameFiled);
                form.add(new JLabel("E-mail: "));
                form.add(emailField);
                form.add(new JLabel("Branch: "));
                form.add(branchBox);
                form.add(new JLabel("Gender: "));
                form.add(genderPanel);
                form.add(new JLabel("Hostel: "));
                form.add(hostel);
                form.add(new JLabel());
                form.add(sumbit);
                JFrame frame=new JFrame("Registration (GridLayout)");
                frame.setContentPane(form);
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
            });
        }
    }
