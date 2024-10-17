package classExercize.threadEx.methods;

class MyThread extends Thread{
    public MyThread(){

    }
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Counting: "+i);
            try{
                sleep(1000);
            }catch(Exception e){
                System.out.print("Some Problem");
            }
        }
    }
}

public class YieldEx{
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName()+" Start");
        MyThread t1 = new MyThread();


        t1.start();

        try{
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(5000);
        }catch(Exception e){}

        Thread.yield();
        System.out.println("Main end");
    }
}
