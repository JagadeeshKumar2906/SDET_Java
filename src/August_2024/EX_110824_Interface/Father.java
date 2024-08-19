package August_2024.EX_110824_Interface;

interface Father
{
    void homeLoan();
    void carLoan();
    default void jewelloan()
    {
        System.out.println("test");
    }
    default void oldLoan()
    {
        System.out.println("oldloan");
    }
}
