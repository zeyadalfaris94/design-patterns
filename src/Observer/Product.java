package Observer;

public class Product implements IObservable {

    private boolean state;

    public Product(boolean state){
        this.state = state;
    }

    @Override
    public void notifyUsers() {
        observers.forEach(observer -> observer.notifyUser(state));
    }

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    public void changeState(){
        this.state = !this.state;

        if(this.state)
            this.notifyUsers();
    }
}
