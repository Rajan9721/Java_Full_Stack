package classExercize.threadEx.runnable;

import java.util.Date;
class RunnableJoin implements Runnable{
    public void run(){
        Thread thread = Thread.currentThread();
        System.out.println("Runnable is being run by "+thread.getName() + " at "+new Date());

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Runnable is exit by "+thread.getName() + " at "+new Date());
        System.out.println();

    }
}

public class ThreadJoinExample2{

    public static void main(String[] args) throws InterruptedException {

        RunnableJoin rj = new RunnableJoin();

        Thread thread1 = new Thread(rj, "T1");
        Thread thread2 = new Thread(rj, "T2");
        Thread thread3 = new Thread(rj, "T3");
        Thread thread4 = new Thread(rj, "T4");

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        thread3.start();
        thread3.join();

        thread4.start();
        thread4.join();


        Thread thread5 = new Thread(rj, "T5");
        Thread thread6 = new Thread(rj, "T6");
        Thread thread7 = new Thread(rj, "T7");
        Thread thread8 = new Thread(rj, "T8");

        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();



    }
}
