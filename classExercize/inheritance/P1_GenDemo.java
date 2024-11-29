package classExercize.inheritance;

class Gen<T>{
    T ob; // compiler declare an object of type T
    int x;

    Gen(T o, int z){
        ob = o;
        this.x = z;
    }

    T getOb(){
        System.out.println("Value of x="+x);
        return ob;
    }

    void showType(){
        Class c = ob.getClass();
        System.out.println("Type of T is: "+c.getName());
    }

}

class Emp{
    int x = 200;
}

public class P1_GenDemo{
    public static void main(String args[]){
        Gen<Integer> iOb = new Gen<Integer>(98,100);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value of T: "+v);
        System.out.println();

        Gen<String> strOb = new Gen<>("Generics Test",200);
        //Gen<String> strOb = new Gen<String>("Generics Test",200);
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Value: "+str);
        Emp e1 = new Emp();
        System.out.println();

        Gen<Emp> empOb = new Gen<Emp>(e1,300);
        empOb.showType();
        Emp e2 = empOb.getOb();
        System.out.println("Value: "+e2.x);

        // iOb = strOb;
    }
}
