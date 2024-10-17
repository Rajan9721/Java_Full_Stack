package classExercize.threadEx.synchronization;

class Shared{
    static int x, y;
    synchronized static void show(String s, int a){
        x=a;
        System.out.println("Starting in method show "+s+" "+x);

        try{
            Thread.sleep(1000);
        }catch(Exception e){}

        System.out.println("Exit from method show "+s+" "+x);
    }

    synchronized static int add(int a, int b){
        System.out.println("Inside add method "+Thread.currentThread().getName());
        x = a;
        y = b;

        try{
            Thread.sleep(1000);
        }catch(Exception e){}
        return x+y;
    }

    synchronized void show1(String s, int a){
        System.out.println("Starting show1 "+s);
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
        System.out.println("Ending show1 "+s);
    }

    void show2(String s, int a){
        System.out.println("Starting in method show2 "+ s);

        synchronized (this){
            x=a;
            System.out.println("Starting in synchronized block "+s+" "+x);

            try{
                Thread.sleep(1000);
            }catch(Exception e){}

            System.out.println("Exit from synchronized block "+s+" "+x);
        }
    }

    Temp t = new Temp();
    void show3(String s, int a){
        System.out.println("Starting in method show3 "+s);
        synchronized(t){
            t.dilToPagalHai(s);
        }
    }

    synchronized void show4(String s, int a){
        x= a;
        System.out.println("Starting in method show4 "+s+" "+x);
        Thread.currentThread().suspend();
        Thread.currentThread().resume();

        System.out.println("Exit from method show4 "+s+" "+x);
    }
}

class Temp{
    void dilToPagalHai(String s){
        System.out.println("Starting in method dilToPagalHai "+"  "+s);

        try{
            Thread.sleep(2000);
        }catch(Exception e){}

        System.out.println("Ending from dilToPagal hai method "+"  "+s);
    }
}


class CustomThread extends Thread{
    Shared s;
    public CustomThread(Shared s, String str){
        super(str);
        this.s = s;
        start();
    }

    public void run(){
        Shared.show(Thread.currentThread().getName(), 10);
        System.out.println("Thread1 Sum of 10, 20= "+s.add(10,20));
    }

}

class CustomThread1 extends Thread{
    Shared s;
    public CustomThread1(Shared s, String str){
        super(str);
        this.s = s;
        start();
    }

    public void run(){
        Shared.show(Thread.currentThread().getName(), 20);
        System.out.println("Thread2 Sum of 100, 200= "+s.add(100,200));
    }

}

class CustomThread2 extends Thread{
    Shared s;
    public CustomThread2(Shared s, String str){
        super(str);
        this.s = s;
        start();

    }

    public void run(){
        Shared.show(Thread.currentThread().getName(), 30);
        //System.out.println("Thread3 Sum of 1000, 2000= "+s.add(1000,2000));
    }
}
public class RunSync {
    public static void main(String[] args){
        Shared st = new Shared();

        CustomThread t1 = new CustomThread(st, "Thread1");
        CustomThread1 t2 = new CustomThread1(st, "Thread2");
//        CustomThread2 t3 = new CustomThread2(st, "Thread3");
    }
}
