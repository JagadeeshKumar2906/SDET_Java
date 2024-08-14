package Ex_080824;

public class Exercise_024_BankAccounts {
    String bankname;
    int accountno;
    String branch;

    Exercise_024_BankAccounts()
    {
        bankname ="SBI";
        accountno = 5686664;
        branch = "Chennai";
    }

    Exercise_024_BankAccounts(String bname, int accno,String brn)
    {
        this.bankname = bname;
        this.accountno = accno;
        this.branch = brn;

    }

}
