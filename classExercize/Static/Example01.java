package classExercize.Static;

public class Example01 {
    int x = 10;
    public static int a = 20;
    public static void display(){
        System.out.println("Display Static");
    }
    public void display1(){
        System.out.println("Normal Display 1 method");
    }
    public static void main(String[] args) {
        Example01 em1 = new Example01();
        System.out.println(em1.x);
        System.out.println(a);
        display();
        em1.display1();

    }
}
