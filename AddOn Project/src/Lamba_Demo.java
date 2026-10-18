import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class Lamba_Demo {
    interface MathOperation{
        int operate(int a,int b);
    }
    public static void main(String[] args) {
        MathOperation addition=(int a,int b)->a+b;

        System.out.println(addition.operate(5,6));

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("All Elements:");
        list.forEach(n-> System.out.println(n));

        list.forEach(n->{
            if(n%2==0)
            {
                System.out.println(n);
            }
        });
    }
}
