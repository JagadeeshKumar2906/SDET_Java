package August_2024.EX_100824_EncapsulationExamples;

public class Exercise_029_Principal
{

    private String sname;
    private long phno;

    public Exercise_029_Principal(String name, long phnos)
    {
        this.sname= name;
        this.phno = phnos;

    }
    public String getSname()
    {
        //System.out.println("The Old name of the Student is:"+ sname);
        return sname;

    }
    public void setSname(String name)
    {
        this.sname = name;
    }

    public long getphno()
    {
        return phno;
    }
}
