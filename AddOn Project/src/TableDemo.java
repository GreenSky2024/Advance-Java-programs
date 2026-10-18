import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TableDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            String[] cols={"Roll No","Name","Branch","Marks"};
            DefaultTableModel model=new DefaultTableModel(cols,0);
            model.addRow(new Object[]{"101","Asha","CSE",86.5,"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});
            model.addRow(new Object[]{"101","Asha","CSE",86.5});
            model.addRow(new Object[]{"102","vedantat","IT",90.23});


            JTable table=new JTable(model);
            table.setRowHeight(24);

            JFrame f=new JFrame("Students");
            f.add(new JScrollPane(table));

            f.setSize(500,500);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setVisible(true);

        });
    }
}
