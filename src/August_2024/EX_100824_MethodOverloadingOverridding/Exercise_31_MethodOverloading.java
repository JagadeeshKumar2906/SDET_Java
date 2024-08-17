package August_2024.EX_100824_MethodOverloadingOverridding;

public class Exercise_31_MethodOverloading
{
    public static void main(String[] args)
    {
        Math mathoper = new Math();
        int result = mathoper.math(2,3);
        double result1 = mathoper.math(5,8);
        String result2 = mathoper.math("Jagadeesh",2906);
        System.out.println(result2);
        System.out.println(result1);

    }
}
