package Factory;

public class CreditCardCreator extends PaymentCreatorFactory{
    @Override
    public IPaymentService createPaymentService() {
        return new CreditCard();
    }
}
