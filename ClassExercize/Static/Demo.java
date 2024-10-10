package ClassExercize.Static;
class Example{
    int x =20;
    static int n = 90;
    static int y;

    public void display1(){
        System.out.println(n);
        System.out.println(x);
        System.out.println(y);
    }
    public static void display(){
        int z =10;
        n = 16;

        System.out.println(y);
        System.out.println(n);
        System.out.println("Static method");
    }
}
public class Demo {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.display1();
        Example.display();
        System.out.println();
        System.out.println("Main method: "+ex.x);
        System.out.println("Static DM: "+ Example.n);
        System.out.println("Normal method: "+ex.x);
        Example.display();

        System.out.println(Example.n);

        Example ex2 = new Example();
        Example.n = 15;
        System.out.println(Example.n);

    }

}
