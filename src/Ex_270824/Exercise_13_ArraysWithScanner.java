package Ex_270824;

import java.util.Scanner;

public class Exercise_13_ArraysWithScanner {
    public static void main(String[] args) {
        int [] marks = new int[5];
        System.out.println("Enter the 1st mark:");
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]=99;
        marks[2]=90;
        marks[3]=80;
        System.out.println("Enterd mark is: "+marks[0]);
        System.out.println("2nd mark:"+marks[1]);
        System.out.println("3rd mark:"+marks[2]);
        System.out.println("4th mark:"+marks[3]);


    }
}
