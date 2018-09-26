import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("輸入三邊長");
        System.out.print("ａ＝");
        int a = scn.nextInt();
        System.out.print("ｂ＝");
        int b = scn.nextInt();
        System.out.print("ｃ＝");
        int c = scn.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("ture");
        } else {
            System.out.println("false");
        }
    }
}
