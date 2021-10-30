package Observer;

public class Users implements IObserver {

    private final int id;
    private final String name;

    public Users(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void notifyUser(boolean state) {
        System.out.println("User " + this.name + " with id: " + this.id + " has been notified");
    }
}
