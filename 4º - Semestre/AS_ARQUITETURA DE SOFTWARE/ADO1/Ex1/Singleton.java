package Ex1;
public class Singleton {

    private static Singleton singleton;

    private Singleton(){};

    public static Singleton getInstancia(){
        return singleton;
    }

}