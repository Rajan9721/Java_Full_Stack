package classExercize.threadEx.runnable;

class ThreadI implements Runnable{
    int x = 10;
    public void run(){
        System.out.println(Thread.currentThread().getName()+x);
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
    }
}
public class RunThread1 {
    public static void main(String[] args) {
        ThreadI t01 = new ThreadI();

        Thread tt1 = new Thread(t01,"Thread1");
        tt1.start();
//        Thread tt01 = new Thread("Thread1");
//        tt01.start();
        Thread tt2 = new Thread(t01, "Thread2");
        tt2.start();
    }
}
