package classExercize.threadEx;

import javax.swing.JFrame;

class ShutDownHooks1 implements Runnable{
    public void run(){
        System.out.println("***********  Application Shutting Down  *********");
        ShutDownHooks2 hook = new ShutDownHooks2();
        Thread t1 = new Thread(hook);
        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            System.out.println("Some Problem "+e);
        }
        System.out.println("***** After Backup *****");
    }
}

class ShutDownHooks2 implements Runnable{
    public void run(){
        System.out.println("****  Taking Backup and closing resource ****");

        try{
            Thread.sleep(1000*5);
        }catch(Exception e){}
    }
}

public class ShutDownHooks{
    public static void main(String[] args){
        Runtime runTime = Runtime.getRuntime();

        ShutDownHooks1 hook = new ShutDownHooks1();

        // Registering shutdown hook
        runTime.addShutdownHook(new Thread(hook));

        //System.exit(0);
        //int x = 10/0;

        JFrame testFrame = new JFrame("Test Frame");
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setSize(400,400);
        testFrame.setVisible(true);
        System.out.println("Hello");
    }
}
