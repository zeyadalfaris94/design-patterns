package Factory;

public class PaypalCreator extends PaymentCreatorFactory{
    @Override
    public IPaymentService createPaymentService() {
        return new Paypal();
    }
}
