package August_2024.EX_100824_MethodOverloadingOverridding;

public class Math
{

    int math(int a, int b)
    {
        int c = a + b;
        return c;
    }
    double math(double a, double b, double d) {
        d = (a * b);
        return d;
    }
    String math (String name, int e)
    {
        return name+e;
    }

}
