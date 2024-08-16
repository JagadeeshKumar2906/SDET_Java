package August_2024.EX_100824_EncapsulationExamples;

public class Student {
    public static void main(String[] args) {
        Principal pal = new Principal("Jagadeesh", 8608619345l);
        pal.getSname();
        System.out.println("The old name of the Student is:" + pal.getSname());
        pal.setSname("JagadeeshKumar");
        System.out.println("The new name of the Student is:" + pal.getSname());
        pal.getphno();
        System.out.println("Ph no of the Student is:" + pal.getphno());
    }
}
