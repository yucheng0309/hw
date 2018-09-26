import java.util.Scanner;

public class hw2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("a1=");
        int a1= scn.nextInt();
        System.out.print("a2=");
        int a2= scn.nextInt();

        System.out.println("a1+a2=" + (a1+a2));
        System.out.println("a1-a2=" + (a1-a2));
        System.out.println("a1*a2=" + (a1*a2));

    }
}
