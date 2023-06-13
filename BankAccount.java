public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalBalance = 0;

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        totalBalance += checkingBalance + savingsBalance;
    }

    // ---- getter for checking ----
    public double getCheckingBalance(){
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    // ---- getter for savings ----
    public double getSavingsBalance(){
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    // ---- deposit method ----
    public void deposit(double amount, String accType){
        switch (accType.toLowerCase()){
            case "checking":
                checkingBalance += amount;
                break;
            case "savings":
                savingsBalance += amount;
                break;
            default:
                // ---- error message if not checking/savings ----
                System.out.println("Account type not recognized, please select between checking or savings account.");
                break;
        }
        totalBalance += amount;
    }

    // ---- withdrawal method ----
    public void withdraw(double amount, String accType){
        switch (accType.toLowerCase()){
            case "checking":
                if (amount <= checkingBalance){
                    checkingBalance -= amount;
                    totalBalance -= amount;
                } else {
                    System.out.println("You're broke, foo!");
                }
                break;
            case "savings":
                if (amount <= savingsBalance){
                    savingsBalance -= amount;
                    totalBalance -= amount;
                } else {
                    System.out.println("You're broke, foo!");
                }
                break;
            default:
                System.out.println("Account type not recognized, please select between checking or savings account.");
                break;
        }
    }

    // ---- get total ----
    public double getTotal(){
        return checkingBalance + savingsBalance;
    }

    // ---- get number of accounts ----
    public static int getTotalAccounts(){
        return numberOfAccounts;
    }

    // ---- get total for all accounts ----
    public static double getTotalBalance(){
        return totalBalance;
    }
}