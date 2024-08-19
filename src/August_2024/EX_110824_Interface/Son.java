package August_2024.EX_110824_Interface;

public class Son implements Father,Mother
{

    @Override
    public void homeLoan()
    {

    }

    @Override
    public void jewelloan() {
        Father.super.jewelloan();
    }

    @Override
    public void oldLoan() {
        Father.super.oldLoan();
    }

    @Override
    public void homeLoan(String a) {

    }

    @Override
    public void personalLoan()
    {

    }

    @Override
    public void mortageLoan()
    {

    }

    @Override
    public void carLoan()
    {

    }
}
