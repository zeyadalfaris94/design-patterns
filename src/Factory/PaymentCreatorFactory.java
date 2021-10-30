package Factory;

public abstract class PaymentCreatorFactory {
    public abstract IPaymentService createPaymentService();
}
