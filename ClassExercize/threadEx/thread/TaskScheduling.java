package ClassExercize.threadEx.thread;

import javax.swing.*;
import java.util.TimerTask;
import java.util.Timer;

class Task extends TimerTask {

    int count = 1;
    // run is a abstract method that defines task performed at scheduled time.
    public void run(){
//        if(count == 10)
//            System.exit(0);
        JFrame f = new JFrame();
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        count++;
    }
}

public class TaskScheduling {
    public static void main(String[] args) {
        Timer timer = new Timer();
        int delay = 5000;  // delay for 5 sec.
        int period = 1000; // repeat every sec.
        timer.scheduleAtFixedRate(new Task(), delay, period);
    }
}
