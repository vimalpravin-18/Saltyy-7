import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create ATM object
        Atm atm = new Atm(1000, 1234);

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (atm.AtmPin(enteredPin)) {

            int choice;

            do {
                System.out.println("\n1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");

                System.out.print("Choose: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter amount: ");
                        double depositAmount = sc.nextDouble();
                        atm.Deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        double withdrawAmount = sc.nextDouble();
                        atm.Withdra(withdrawAmount);
                        break;

                    case 3:
                        atm.GetBalance();
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 4);

        } else {
            System.out.println("Wrong PIN ❌");
        }

        sc.close();
    }
}