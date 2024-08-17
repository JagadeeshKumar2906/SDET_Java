package August_2024.EX_100824_MethodOverloadingOverridding;

public class Exercise_033_Overloading {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.bark();
        c1.run();
        System.out.println(c1);

        Dog c2= new Dog();
        c2.bark();
        System.out.println(c2);

        Dog c3 = new Cat();
        c3.bark();
        System.out.println(c3);
    }

}
