package August_2024.EX_100824_EncapsulationExamples;

public class Bankencap {
    public static void main(String[] args) {
        HDFCBankAccount hdb = new HDFCBankAccount(58688556665l,10000);
        hdb.getAccno();
        hdb.setBalance(700000, true);
        hdb.setAccno(8988899555l,true);
        System.out.println(hdb.getAccno());
        System.out.println(hdb.getBalance());
    }
}
