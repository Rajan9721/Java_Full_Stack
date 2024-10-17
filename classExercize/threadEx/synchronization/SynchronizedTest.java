package classExercize.threadEx.synchronization;

class Demo {
    private int x;
    private int y;
    int add(int a, int b){
        this.x = a;
        this.y = b;
        return  x+y;
    }
}
public class SynchronizedTest {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        //d1.start();

    }

}
