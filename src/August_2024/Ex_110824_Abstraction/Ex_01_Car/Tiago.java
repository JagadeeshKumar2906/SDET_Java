package August_2024.Ex_110824_Abstraction.Ex_01_Car;

//import August_2024.EX_030824_ConstructorExamples.Car;

public class Tiago extends Engine
{
    void driver()
    {
        openCar();
        engineStart();
        gearBoxPart();
        engineStop();
    }

    @Override
    void engineStart() {
        System.out.println("Tiago Car Started");
    }

    @Override
    void engineStop() {
        System.out.println("Tiago Car Stopped");
    }

    @Override
    void openCar() {
        System.out.println("Open the Car with Tiago remote");
    }

    @Override
    void gearBoxPart() {
        System.out.println("Move the Car with Tiago Gearbox");
    }
}

