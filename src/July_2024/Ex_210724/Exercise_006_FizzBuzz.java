package July_2024.Ex_210724;

//import java.util.Scanner;

public class Exercise_006_FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
           else if (i % 5 == 0)
           {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    }