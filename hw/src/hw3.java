import java.util.Scanner;

public class hw3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("國文=");
        int A = scn.nextInt();
        System.out.print("英文=");
        int B = scn.nextInt();
        System.out.print("數學=");
        int C = scn.nextInt();

        System.out.println("總成績="+(A+B+C)) ;
        System.out.println("平均="+((A+B+C)/3));
    }
}
