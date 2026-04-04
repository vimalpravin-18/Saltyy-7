class PaymentCard extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Payment ₹" + amount + " made with card.");
    }
}
