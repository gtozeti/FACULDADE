public class Singleton {

    private static Singleton singleton;
    // Lazy Singleton
    // private static Singleton singleton = new Singleton();

    private Singleton() {
    };

    public static Singleton getInstancia() {
        return singleton;
    }

    // Lazy Singleton
    // public static Singleton getInstancia() {
    // if (singleton == null) {
    // singleton = new Singleton();
    // }
    // return singleton;
    // }

}
