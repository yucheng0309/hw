import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("輸入攝氏溫度=");
        int C = scn.nextInt();

        System.out.print("等於華氏" +  (C * 9 / 5 + 32)  + "度");
    }
}
