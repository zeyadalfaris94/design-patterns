package Factory;

public class FactoryPattern {

    public static void main(String[] args) {
        String paymentType = "Paypal";
        PaymentCreatorFactory paymentFactory;

        if(paymentType.equals(PaymentTypes.CreditCard.toString())){
            paymentFactory = new CreditCardCreator();
        } else {
            paymentFactory = new PaypalCreator();
        }
        IPaymentService payment = paymentFactory.createPaymentService();
        payment.pay();
    }
}
