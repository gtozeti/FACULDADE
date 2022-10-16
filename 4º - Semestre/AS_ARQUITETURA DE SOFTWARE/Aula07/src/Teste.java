public class Teste extends Thread {
    
    @Override
    public void run(){
        Singleton s = Singleton.getInstancia();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Teste t1 = new Teste();
        Teste t2 = new Teste();

        t1.start();
        t2.start();

    }

}
