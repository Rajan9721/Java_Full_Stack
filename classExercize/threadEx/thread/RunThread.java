package classExercize.threadEx.thread;

class Thread1 extends Thread{
    Thread1(String s){
        super(s);
    }
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(getName());
            try{
                sleep(100);
            }catch(Exception e){}
        }
    }
}

class Thread2 extends Thread{
    Thread2(String s){
        super(s);
    }

    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println(getName());
        }
    }
}

class Thread3 extends Thread{
    Thread3(String s){
        super(s);
    }

    public void run(){
        for(int i=0; i<=15; i++){
            System.out.println(getName());
        }
    }
}
public class RunThread{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Thread1");
        t1.start();
        Thread2 t2 = new Thread2("Thread2");
        t2.start();
        Thread3 t3 = new Thread3("Thread3");
        t3.start();
    }
}
