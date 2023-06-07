public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalBalance = 0;

    public BankAccount(){
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        numberOfAccounts++;
    }

    // ---- getter for checking ----
    public double getCheckingBalance(){
        return checkingBalance;
    }

    // ---- getter for savings ----
    public double getSavingsBalance(){
        return savingsBalance;
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
}