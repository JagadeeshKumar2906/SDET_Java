package Ex_270824;

import java.util.Scanner;

public class Exercise_16_ArrayswithmultipleInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i <a.length; i++) {
           System.out.println("Enter your Marks:" + (i + 1));
            a[i] = sc.nextInt();
       }
        for (int i = 0; i <a.length; i++) {
            System.out.println("The Entered Marks are:" + (i + 1)+a[i]);
        }
           // int j=0;
          //  while (j<a.length)
         //   {
         //       System.out.println(a[j]);
         //       j++;
          //  }
        }
    }

