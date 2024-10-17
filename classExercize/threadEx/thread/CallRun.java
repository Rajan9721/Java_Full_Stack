package classExercize.threadEx.thread;

class Thread001 extends Thread{
    Thread001(String s){
        super();
//        start();
    }

    public void run(){
        for(int i=0; i<5; i++){
//            System.out.println(getName());
            System.out.println(Thread.currentThread().getName());
//            System.out.println("hello");

            try{
                sleep(1000);
            }catch (Exception e){

            }
        }
        System.out.println("Thread001 class run completed");
    }
}

class Thread002 extends Thread{
    Thread002(String s){
        super(s);
        // start();
    }
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                sleep(1000);
            }catch(Exception e){}
        }
        System.out.println("Thread002 class run completed");
    }
}

class Thread003 extends Thread{
    Thread003(String s){
        super(s);
        //start();
    }

    public void run(){
        for(int i=0; i<15; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                sleep(1000);
            }catch(Exception e){};
        }
        System.out.println("Thread003 run complete");
    }
}
public class CallRun {
    public static void main(String[] args) {
        Thread001 t001 = new Thread001("thread1");
        Thread002 t002 = new Thread002("thread2");
        Thread003 t003 = new Thread003("thread3");

        t001.run();
        t002.run();
        t003.run();

        for(int i=0; i<20; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }

        System.out.println(Thread.currentThread().getName()+" Dead");
    }
}
