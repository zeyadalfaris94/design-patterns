package Factory;

public class CreditCard implements IPaymentService{

    @Override
    public void pay() {
        System.out.println("Paying by Credit Card");
    }
}
