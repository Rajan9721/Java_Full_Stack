package classExercize.exceptionHandling;

class Throwable extends Object{
    String s;
    public String toString(){
        return s;
    }
}

class Exception extends Throwable{
    Exception(String s){
        this.s = s;
    }
}
public class ToStringWork {
    public static void main(String[] args) {
        Exception e = new Exception("Hello");
        System.out.println(e);
    }
}
