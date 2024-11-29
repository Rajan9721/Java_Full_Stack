package classExercize.inheritance.overriding;

public class Child extends Parent {
    public void show(){
        System.out.println("Child class");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
