public class BankAccount {
    static String bankName = "State Bank of India";
    String accountHoldersName;
    String accountNumber;
    private double balance;

    public static void main(String[] args) {

        double loanInterestRate = 7.5;

        System.out.println(BankAccount.bankName);
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.accountHoldersName);

        bankAccount.accountHoldersName = "Saswata Mishra";
        bankAccount.accountNumber = "87043281";
        bankAccount.balance = 670.43;

        System.out.println(bankAccount.accountHoldersName);
        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAccount.balance);
    }
}
