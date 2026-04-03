public class Atm {
    private double balance;
    private int pin;

    public Atm(double initialBalance, int pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }   

    public boolean AtmPin(int enterPin) {
        return this.pin == enterPin;
    }

    public void Deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public int Withdra(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient funds. Current balance: " + balance);
            return -1; // Indicating failure
        } else if(amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return -1; // Indicating failure
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
            return 0; // Indicating success
        }
    }

    public void GetBalance() {
        System.out.println("Current balance: " + balance);
    }   
}
