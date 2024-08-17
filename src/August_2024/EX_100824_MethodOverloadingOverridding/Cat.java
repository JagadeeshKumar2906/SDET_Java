package August_2024.EX_100824_MethodOverloadingOverridding;

public class Cat extends Dog{

    @Override

    void bark ()
    {
        System.out.println("I will meow");
    }
    void run()
    {
        System.out.println("I will run fast");
    }
}
