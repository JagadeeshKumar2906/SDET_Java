package August_2024.Ex_110824_Abstraction.Ex_01_Car;

public class Audi extends Engine
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
        System.out.println("Audi Car Started");
    }

    @Override
    void engineStop() {
        System.out.println("Audi Car Stopped");
    }

    @Override
    void openCar() {
        System.out.println("Open the Car with Audi remote");
    }

    @Override
    void gearBoxPart() {
        System.out.println("Move the Car with Audi Gearbox");
    }
}

