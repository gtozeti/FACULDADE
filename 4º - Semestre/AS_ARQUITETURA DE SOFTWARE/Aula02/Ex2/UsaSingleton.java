// Exemplo de Singleton
public class UsaSingleton {
    
    public static void main(String[] args) {
        
        Singleton sin1 = Singleton.getInstancia();
        Singleton sin2 = Singleton.getInstancia();
        System.out.println(sin1);
        System.out.println(sin2);
    }

}
