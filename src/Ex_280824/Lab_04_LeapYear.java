package Ex_280824;

import java.util.Scanner;

public class Lab_04_LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter your year:");
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0))|| (year % 400 == 0))
        {
            System.out.println("Entered is Leap Year");
        }
        else
        {
            System.out.println("Sorry its not Leap Year");
        }
    }
}
