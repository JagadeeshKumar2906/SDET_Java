package July.Ex_270824;

import java.util.Scanner;

public class Exercise_14_ArraysWithBoolean
{
    public static void main(String[] args)
    {
        int [] a = new int[1];
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        a[0]= sc.nextInt();
        boolean[] adult ={true,false};
        if (a[0]>=18)
        {
            System.out.println("You are allowed to Vote:"+adult[0]);
        }
        else
        {
            System.out.println("You are not allowed to vote:"+adult[1]);
        }

    }
}
