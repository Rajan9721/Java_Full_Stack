package classExercize.inheritance.binding;

public class StaticBinding2 {
    public static void main(String[] args) {
        SuperClass sc = new SuperClass();
        SuperClass sc1 = new SubClass();

        SubClass sc2 = new SubClass();

        sc.print();
        sc1.print();

        sc2.print();
    }
}
