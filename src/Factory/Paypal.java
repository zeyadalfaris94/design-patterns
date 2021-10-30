package Factory;

public class Paypal implements IPaymentService{

    @Override
    public void pay() {
        System.out.println("Paying by Paypal");
    }
}
