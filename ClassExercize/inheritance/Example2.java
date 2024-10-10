package ClassExercize.inheritance;


class Base2{
    int x = 20;
    void show(){
        System.out.println("Base");
    }
}

class Child2 extends Base2{
    int x = 30;
    void show(){
        System.out.println("Child");
    }
    void display(){
        System.out.println("Display");
    }
}
public class Example2 {
    public static void main(String[] args) {
        Base2 bs2 = new Child2(); // Upcasting
        bs2.show();

        Child2 ch2 = (Child2) bs2;
        ch2.display();
        System.out.println(bs2.x);
        System.out.println(ch2.x);
    }
}
