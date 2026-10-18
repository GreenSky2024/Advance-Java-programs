import java.awt.*;
import java.awt.event.*;
public class borderlayout extends Frame {
    Button b1,b2,b3,b4;
    Label l1,l2;
    Panel p1,p2;
    public borderlayout()
    {
        setTitle("frame");
        setSize(500,500);
        setVisible(true);

        BorderLayout obj=new BorderLayout(50,5);
        setLayout(obj);


        b1=new Button("login");
        add(b1,obj.NORTH);

        b2=new Button("reset");
        add(b2,obj.SOUTH);

        b3=new Button("sumbit");
        add(b3,obj.EAST);

        b4=new Button("sumbit");
        add(b4,obj.WEST);

        b4=new Button("card");
        add(b4,obj.CENTER);
    }
    public static void main(String[] args) {
        borderlayout obj=new borderlayout();
    }

}
