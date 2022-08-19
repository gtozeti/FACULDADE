public class Par extends Thread {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 100; i += 2) {
            System.out.println(i + " é par");
        }
        System.out.println("fim dos pares");
    }
}
