package Observer;

public class ObserverPattern {
    public static void main(String[] args) {
        IObserver user1 = new Users(1,"Ahmed");
        IObserver user2 = new Users(2, "Ali");
        IObserver user3 = new Users(3, "Ibrahim");
        IObserver user4 = new Users(4, "Wafaa");

        Product product = new Product(false);
        product.add(user1);
        product.add(user2);
        product.add(user3);
        product.add(user4);
        product.remove(user3);
        product.changeState();
        product.changeState();
        product.changeState();
    }
}
