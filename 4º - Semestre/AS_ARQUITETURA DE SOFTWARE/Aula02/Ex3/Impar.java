public class Impar extends Thread{
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 1; i < 101; i+=2) {
            System.out.println(i + " é ímpar");
        }
        System.out.println("fim dos ímpares");
    }

}
