package August_2024.Ex_110824_Abstraction.Ex_03_Bookclass;

public class MyBook extends Book
{
    @Override
    String getDetails(String a, String b, String c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return null;
    }

}

