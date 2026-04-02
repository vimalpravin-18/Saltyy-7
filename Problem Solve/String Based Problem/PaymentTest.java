interface Payment{
    void pay();
}
class UPI implements Payment {
       public void pay() {
            System.out.println("Pay using UPI");
        }
    }

class Card implements Payment {
        public void pay() {
            System.out.println("Pay using Card");
        }
    }


public class PaymentTest {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();
    }
}