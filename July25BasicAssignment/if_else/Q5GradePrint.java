package if_else;

public class Q5GradePrint {
    public static void main(String[] args) {
        System.out.println("Enter the mark to print the grade: ");
        int mark = new java.util.Scanner(System.in).nextInt();

        if(mark>80){
            System.out.println("A grade");
        }else if(mark>60 && mark<=80){
            System.out.println("B grade");
        } else if (mark > 50 && mark <= 60) {
            System.out.println("C Grade");
        } else if (mark > 45 && mark <= 50) {
            System.out.println("D Grade");
        } else if (mark>25 && mark<=45) {
            System.out.println("E Grade");
        }else{
            System.out.println("Fail");
        }
    }
}
