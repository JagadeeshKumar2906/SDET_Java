package July.Ex_270824;

import java.util.Scanner;

public class Exercise_20_GetMarksFixMaxandMin {
    public static void main(String[] args) {
        System.out.println("Enter Your Marks");
        Scanner sc = new Scanner(System.in);
        int[] marks= new int[5];
        int max =1;
        int min =0;
        for(int i=0;i<marks.length;i++)
        //for(int i=0;i<=5;i++)
        {
            System.out.println("Enter Marks:"+(i+1));
            marks[i]=sc.nextInt();
            if(marks[i]>max)
            {
                max=marks[i];
            }

            if (min== 0 || marks[i]<min)
            {
                min=marks[i];
            }
        }
        System.out.println("The Maximum Mark is:"+max);
        System.out.println("The Minimum Mark is:"+min);
    }
}
