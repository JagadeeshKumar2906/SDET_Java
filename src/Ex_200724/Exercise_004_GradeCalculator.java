package Ex_200724;

import java.util.Scanner;
public class Exercise_004_GradeCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score:");
        int a = sc.nextInt();
        char grade = 'F';
        if (a >= 90 && a<=100)
        {
            grade = 'A';
        }
        else if (a>= 80 && a<= 89)
        {
            grade = 'B';
        }
        else if (a>=70 && a<= 79)
        {
            grade = 'C';
        }
        else if (a>=60 && a<=69)
        {
            grade = 'D';
        }
        else if (a>=1 && a<=59)
        {
            grade = 'E';
        }
        else if (a>=0 || a<=101)
        {
            grade = 'I';
        }
        else
        {
            grade = 'F';
        }
        System.out.println("The grade is:" +grade);
        sc.close();
    }
}
