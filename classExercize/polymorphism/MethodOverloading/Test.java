package classExercize.polymorphism.MethodOverloading;

public class Test {

    public void sum(int a, int b){
        System.out.println(a+"+"+b+" = "+(a+b));
    }
    public long sum(long a, long b){
        return (a+b);
    }

    public static void main(String[] args){
        Test t1 = new Test();
        t1.sum(10,25);

        long l = t1.sum(500L,1000L);
        

        System.out.println(t1.sum(10L,150));
        System.out.println(l);
    }
}
