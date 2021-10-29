package Singleton;

public class Singleton {
    private static Singleton instance;
    public static int cnt = 0;

    private Singleton() {
    }

    synchronized public static Singleton getInstance() {
        if (instance == null) {
            cnt++;
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
