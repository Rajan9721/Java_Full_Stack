package classExercize.threadEx;
class MyThread1 extends Thread{
    MyThread1(String str){
        super(str);
        //start();
    }
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                sleep(1000);
            }catch(Exception e){
                System.out.println("Some Problem");
            }
        }
        System.out.println(currentThread().getName()+ "Dead");
    }
}

class MyThread2 extends Thread{
    MyThread2(String str){
        super(str);
        // start();
    }

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                sleep(1000);
            }catch(Exception e){
                System.out.println();
            }

        }
        System.out.println(Thread.currentThread().getName()+ " end");
    }
}

class MyThread3 extends Thread{
    public MyThread3(String str){
        super(str);
        //start();
    }

    public void run(){
        for(int i=1; i<15; i++){
            System.out.println(currentThread().getName());
            try{
                sleep(1000);
            }catch(Exception e){
                System.out.println("Some Problem");
            }
        }
        System.out.println(getName()+" dead");
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Thread1");
        MyThread2 t2 = new MyThread2("Thread2");
        MyThread3 t3 = new MyThread3("thread3");

        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
            //System.out.println("Tata");

            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println("Some Problem");
            }
        }

        System.out.println(Thread.currentThread().getName()+" End");

    }
}

