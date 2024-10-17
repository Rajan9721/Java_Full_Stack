package classExercize.garbageCollector;

class Demo{
    int x=10;
    int y=20;

    @Override
    public void finalize() throws Throwable{
        System.out.println("Garbage collector runs. "+Thread.currentThread().getName());
    }
}

public class FirstGC {
    public static void show(){
        System.out.println("Show Method Start");
        Demo d2 = new Demo();
        display();
        System.out.println("Show Method end");
    }
    public static void display(){
        System.out.println("Display method start");
        Demo d3 = new Demo();
        System.out.println("Display Method end");
    }
    public static void main(String[] args) {
        show();
        for (int i=0; i<2000; i++){
            System.gc();
        }
    }
}
