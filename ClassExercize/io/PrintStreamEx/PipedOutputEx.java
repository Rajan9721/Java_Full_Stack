package ClassExercize.io.PrintStreamEx;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Poutput implements Runnable{
    PipedOutputStream pout;
    Poutput(PipedOutputStream pout){
        this.pout = pout;
    }

    public void run(){
        for(int i=65; i<=95; i++){
            try{
                pout.write(i);
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("Some Problem occured");
            }
        }
    }
}

class Pinput implements Runnable{
    PipedInputStream pin;

    Pinput(PipedInputStream pin){
        this.pin = pin;
    }
    public void run(){
        int z = 0;
        for(int i=65; i<=91; i++){
            try{
                z = pin.read();
            }catch(Exception e){
                System.out.println((char)z);
            }
        }
    }
}
public class PipedOutputEx {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pout = new PipedOutputStream();
        PipedInputStream pin = new PipedInputStream();

        pout.connect(pin);
        Poutput po = new Poutput(pout);
        Pinput pi = new Pinput(pin);
        Thread t1 = new Thread(po);
        Thread t2 = new Thread(pi);
        t1.start();
        t2.start();

    }
}