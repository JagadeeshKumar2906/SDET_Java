package July.Ex_270824;

public class Exercise_19_ArraysWithMinandMax
{
    public static void main(String[] args)
    {
        int[] Salaries ={10,8,5,7,20,1,6};
        int max = Salaries[0];
        for(int i=0; i<Salaries.length;i++)
        {
            if (Salaries[i] > max)
            {
                max=Salaries[i];
            }
        }
        System.out.println("The max Values is:"+max);
        int min = Salaries[0];
        for(int j=0;j<Salaries.length;j++)
        {
            if(Salaries[j]<min)
            {
                min=Salaries[j];
            }
        }
        System.out.println("The Min Value is:"+min);
    }
}
