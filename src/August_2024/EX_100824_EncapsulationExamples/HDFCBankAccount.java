package August_2024.EX_100824_EncapsulationExamples;

public class HDFCBankAccount {

    //data memebers always private

    private long Accno;
    private long balance;

    //methods
    public HDFCBankAccount(long Accno,long bal)
    {
            this.Accno = Accno;
            this.balance = bal;
    }
    //getter and setter for account no

    public long getAccno() {
        return Accno;
    }

    public void setAccno(long accno,boolean isAdmin)
    {
        if(isAdmin)
        {
            System.out.println("Yes this is my account no:"+Accno);
            this.Accno = accno;
        }
        else
        {
            System.out.println("No you are allowed to view the account");
        }

    }

    public long getBalance()
    {
        return balance;
    }

    public void setBalance(long balance, boolean isAdmin)
    {
        if(isAdmin)
        {
            System.out.println("Here your balance:"+balance);
            this.balance = balance;
        }
        else
        {
            System.out.println("You are not authorized:");
        }

    }
}
