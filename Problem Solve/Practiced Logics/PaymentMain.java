public class PaymentMain {
    public static void main(String[] args) {

        Payment p;

        // Card Payment
        p = new PaymentCard();
        p.pay(1000);

        // UPI Payment
        p = new PaymentUPI();
        p.pay(500);

        // Cash Payment
        p = new PaymentCash();
        p.pay(200);
    }
}