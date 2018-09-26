import java.util.Scanner;

public class hw4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("體重(cm)=");
        int cm = scn.nextInt();
        System.out.print("體重(kg)=");
        int kg = scn.nextInt();


        System.out.println(cm + "公分=" + (cm/2.54) + "英吋");
        System.out.println(kg + "公斤=" + (kg/0.454) + "磅");
    }
}
