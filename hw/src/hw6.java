import java.util.Scanner;

public class hw6 {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("輸入三個1~3000的正整數西元年");
        int y1 = scn.nextInt();
        int y2 = scn.nextInt();
        int y3 = scn.nextInt();

        if (y1%4==0)
        {
            if(y1%100==0)
            {
                if(y1%400==0)
                {
                    System.out.println("ture");
                }
                else
                {
                    System.out.println("flose");
                }
            }
            else
            {
                System.out.println("ture");
            }
        }
        else
        {
            System.out.println("flose");
        }

        if (y2%4==0)
        {
            if(y2%100==0)
            {
                if(y2%400==0)
                {
                    System.out.println("ture");
                }
                else
                {
                    System.out.println("flose");
                }
            }
            System.out.println("ture");
        }
        else
            System.out.println("flose");

        if (y3%4==0)
        {
            if(y3%100==0)
            {
                if(y3%400==0)
                {
                    System.out.println("ture");
                }
                else
                {
                    System.out.println("flose");
                }
            }
            System.out.println("ture");
        }
        else
            System.out.println("flose");
    }
}
