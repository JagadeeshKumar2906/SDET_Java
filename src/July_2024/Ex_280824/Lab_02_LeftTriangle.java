package July_2024.Ex_280824;

public class Lab_02_LeftTriangle
{
    public static void main(String[] args)
    {
        int n=5;
        for (int i = n; i >=1; i--)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
