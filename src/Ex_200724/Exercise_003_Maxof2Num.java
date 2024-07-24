package Ex_200724;

import java.util.Scanner;

public class Exercise_003_Maxof2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number1:");
        int a = sc.nextInt();

        System.out.println("Please Enter the number2:");
        int b = sc.nextInt();

        if(a>b)
        {
            System.out.println("Number1 is Greater");
        }
        else if (b>a)
        {
            System.out.println("Number2 is Greater");
        }
        else
        {
            System.out.println("Both the entered Numbers are equal");
        }
    }
}
