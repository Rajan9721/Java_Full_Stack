package ClassExercize.inheritance;


class Base{
    A show(){
        System.out.println("Base");
        return new A();
    }
}

class Child extends Base{
    B show(){
        System.out.println("Child");
        return new B();
    }
}
public class Example1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}

class A{

}
class B extends A{

}

