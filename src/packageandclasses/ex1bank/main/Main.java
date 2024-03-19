package packageandclasses.ex1bank.main;
import packageandclasses.ex1bank.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount();
        newAccount.accountNumber = 1001;
        newAccount.accountHolder = "Mike";
        newAccount.balance = 2024.03;

        System.out.println("Account Number: " + newAccount.accountNumber);
        System.out.println("Account Holder: " + newAccount.accountHolder);
        System.out.println("Account Balance: " + newAccount.balance);
    }
}
