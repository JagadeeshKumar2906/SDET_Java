package August_2024.EX_030824_ConstructorExamples;

public class Exercise_026_Son extends Exercise_025_Father
{
    String name;
    int price;

    void soncarmodel(String nname, int pprice)
    {
        this.name = nname;
        this.price = pprice;
    }
    public static void main(String[] args)
    {
        Exercise_026_Son s1 = new Exercise_026_Son();
        s1.soncarmodel("BMW",990000);
        {
            System.out.println("Son Car Name is:"+s1.name);
            System.out.println("Price of the Car is:"+s1.price);
        }
        s1.fathercarmodel();
        {
            System.out.println("Father Car is Maruthi");
            System.out.println("Price is : 1000000");
        }
    }
}
