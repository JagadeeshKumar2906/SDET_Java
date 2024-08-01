package Ex_270824;

public class Exercise_07_ArrayswithMaxSalaries
{
    public static void main(String[] args)
    {
        int[] Salaries = {9,5,25,34,1,58,89};
        int max =1;
        for(int i=0;i< Salaries.length;i++)
            if (Salaries[i] > max) {
                max = Salaries[i];
            }
        System.out.println(max);

        }
    }