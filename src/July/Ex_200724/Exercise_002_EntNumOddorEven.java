package July.Ex_200724;
import java.util.Scanner;
public class Exercise_002_EntNumOddorEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number:");
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("The Entered Number is Even");
        }
        else
        {
            System.out.println("The Entered Number is Odd");
        }
    }
}
