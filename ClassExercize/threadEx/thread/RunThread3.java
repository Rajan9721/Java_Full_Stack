package ClassExercize.threadEx.thread;

class Thread01 extends Thread{
    Thread01(String s){
        super(s);
        // start();
    }

    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                sleep(1000);
            }catch(Exception e) {

            }
        }
        System.out.println(getName()+" Dead");
    }
}

class Thread02 extends Thread{
    Thread02(String s){
        super(s);
        // start();
    }

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                sleep(1000);
            }catch(Exception e){

            }
        }
        System.out.println(getName()+" Dead");
    }
}

class Thread03 extends Thread{
    Thread03(String s){
        super(s);
        //start();
    }

    public void run(){
        for(int i=0; i<15; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                sleep(1000);
            }catch(Exception e){

            }
        }
        System.out.println(getName()+" Dead");
    }
}
public class RunThread3 {
    public static void main(String[] args) {
        Thread01 t1 = new Thread01("thread01");
        Thread02 t2 = new Thread02("thread02");
        Thread03 t3 = new Thread03("thread03");

        t1.start();
        t2.start();
        t3.start();

        for(int i=0; i<20; i++){
            System.out.println(Thread.currentThread().getName());
//            System.out.println();

            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
        System.out.println(Thread.currentThread().getName()+" Dead");
    }
}
