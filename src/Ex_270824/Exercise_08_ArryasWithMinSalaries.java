package Ex_270824;

public class Exercise_08_ArryasWithMinSalaries {
    public static void main(String[] args) {
        int[] salaries={10,5,8,2,9};
        int min=salaries[0];
        for(int i=0;i<salaries.length;i++){
        if(min>salaries[i] ){
            min=salaries[i];
            }
        }
        System.out.println(min);
    }
}
