package August_2024.EX_030824_ConstructorExamples;

import java.util.Scanner;

public class Exercise_025_BankObjects {
    public static void main(String[] args) {
        Exercise_024_BankAccounts Bnk1 = new Exercise_024_BankAccounts();

        System.out.println(Bnk1.bankname);
        System.out.println(Bnk1.accountno);
        System.out.println(Bnk1.branch);


        Exercise_024_BankAccounts Bnk2 = new Exercise_024_BankAccounts("ICICI",898989,"Madurai");

        System.out.println(Bnk2.bankname);
        System.out.println(Bnk2.accountno);
        System.out.println(Bnk2.branch);

        Exercise_024_BankAccounts Bnk3 = new Exercise_024_BankAccounts();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Bank Name:");
        sc.next();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your account Number:");
        sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your Branch:");
        sc2.next();

        System.out.println(Bnk3.bankname);
        System.out.println(Bnk3.accountno);
        System.out.println(Bnk3.branch);

    }
}
