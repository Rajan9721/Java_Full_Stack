package classExercize.threadEx.methods;

class Thread01 extends Thread{
    public Thread01(String str){
        super(str);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try{
            sleep(60000*10);
        }catch(Exception e){
            System.out.println("Interrupted Exception forcely"+e);
        }
        System.out.println(getName()+" dead");
    }
}

class Thread02 extends Thread{
    Thread01 t;
    public Thread02(String str, Thread01 t){
        super(str);
        this.t=t;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        t.interrupt();

        try{
            sleep(1000);
        }catch(Exception e){

        }
        System.out.println(getName()+" dead");
    }
}

public class Interrupt{
    public static void main(String[] args){

        Thread01 t1 = new Thread01("thread1");
        t1.setPriority(10);

        Thread02 t2 = new Thread02("thread2", t1);
        t1.start();
        t2.start();
    }
}