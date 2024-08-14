package Ex_080824;

public class Exercise_022_Constructor
{
    String name;
    long phoneno;

    Exercise_022_Constructor()
    {
        System.out.println("Initial Class Created");
    }

    Exercise_022_Constructor(String nname, long nphoneno)
    {
        this.name = nname;
        this.phoneno = nphoneno;
    }
}
