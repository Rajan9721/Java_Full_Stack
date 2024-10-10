package ClassExercize.cunstructor;

class Base{
    int x = 10;

//    Base(){
//        System.out.println("Base class Constructor. ");
//    }
}
public class Child extends Base{

    Child(){
        System.out.println("Default of child class constructor.");
    }

    Child(int x, int y){
        this();
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        new Child(10,20);
    }

}
