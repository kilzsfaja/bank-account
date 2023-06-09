public class Bank {
    public static void main(String[] args){
        BankAccount weezy = new BankAccount(0, 0);
        BankAccount wayne = new BankAccount(0, 0);

    // ---- weezy deposits ----
    weezy.deposit(5, "checking");
    weezy.deposit(15, "savings");

    // ---- wayne deposits ----
    wayne.deposit(25, "checking");
    wayne.deposit(35, "savings");

    // ---- tests for weezy ----
    System.out.println("---- Account Information ----");
    System.out.println("Checking Account: " + weezy.getCheckingBalance());
    System.out.println("Savings Account: " + weezy.getSavingsBalance());
    System.out.println("Total Balance: " + weezy.getTotal());
    System.out.println("Total Number of Accounts: " + BankAccount.getTotalAccounts());
    System.out.println("Total Balance of all Accounts: " + weezy.getTotalBalance());

    // ---- tests for wayne ----
    System.out.println("---- Account Information ----");
    System.out.println("Checking Account: " + wayne.getCheckingBalance());
    System.out.println("Savings Account: " + wayne.getSavingsBalance());
    System.out.println("Total Balance: " + wayne.getTotal());
    System.out.println("Total Number of Accounts: " + BankAccount.getTotalAccounts());
    System.out.println("Total Balance of all Accounts: " + wayne.getTotalBalance());

    }
}