public class Singleton {

    private static Singleton singleton;

    private Singleton(){};

    public synchronized static Singleton getInstancia(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}