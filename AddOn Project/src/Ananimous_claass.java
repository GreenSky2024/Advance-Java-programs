class Animal{
    void makesound()
    {
        System.out.println("Animal class make sound method");
    }
}
interface Greeting
{
    void sayHello();
}
public class Ananimous_claass {
    public static void main(String[] args) {

        Animal animal=new Animal()
        {
            @Override
            void makesound() {
                System.out.println("Woff woff");
            }
        };
        animal.makesound();
        Greeting greeting=new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Guys......");
            }
        };
        greeting.sayHello();
    }
}
