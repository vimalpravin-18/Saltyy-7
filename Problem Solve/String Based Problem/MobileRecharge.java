public class MobileRecharge {
    static String network = "Jio";
    int balance = 0;

    void Recharge(int amount) {
        System.out.println("Recharged for : "+ amount);
        balance = balance + amount;
    }

    void Mbused(int mbused) {
        System.out.println("MB's Used : "+ mbused);
        balance = balance - mbused;
    }

     public int DisplayBalance() {
        return balance;
    }

    public static void main(String[] args) {
        MobileRecharge m1 = new MobileRecharge();
        // MobileRecharge m2 = new MobileRecharge();

        System.out.println(MobileRecharge.network);
        

        m1.Recharge(300);
        m1.Mbused(50);
        System.out.println("Balance Data is : "+m1.DisplayBalance());

        m1.Recharge(800);
        m1.Mbused(300);
        System.out.println("Balance Data is : "+m1.DisplayBalance());
    }
}