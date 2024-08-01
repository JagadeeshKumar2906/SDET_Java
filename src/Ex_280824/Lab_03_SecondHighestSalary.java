package Ex_280824;

public class Lab_03_SecondHighestSalary {
    public static void main(String[] args) {
        int[] Salary ={7,10,4,13,25,18,9,8,17,35};
        int max =1;
        for (int i = 0; i < Salary.length ; i++)
        {
            if(Salary[i] >max)
            max=Salary[i];
        }
        System.out.println("The Maximum Salary is:"+max);
    }
}
