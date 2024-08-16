package August_2024.EX_100824_EncapsulationExamples;

public class Exercise_030_Student {
    public static void main(String[] args) {
        Exercise_029_Principal pal = new Exercise_029_Principal("Jagadeesh", 8608619345l);
        pal.getSname();
        System.out.println("The old name of the Student is:" + pal.getSname());
        pal.setSname("JagadeeshKumar");
        System.out.println("The new name of the Student is:" + pal.getSname());
        pal.getphno();
        System.out.println("Ph no of the Student is:" + pal.getphno());
    }
}
