package exe1;
import java.util.Random;

public class RandomFinishThread extends Thread implements Runnable{
    @Override
    public void run() {
        Random number = new Random();
        int time = number.nextInt(500);
        try {
            System.out.println("Iniciando Thread...");
            Thread.sleep(time);
            System.out.println("Thread Finalizada em " +  time);
        } catch (InterruptedException err) {
            System.out.println("Thread de RandomFinish foi interrompida. ID: " + Thread.currentThread().getId());
            err.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RandomFinishThread thread1 = new RandomFinishThread();
        RandomFinishThread thread2 = new RandomFinishThread();
        RandomFinishThread thread3 = new RandomFinishThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
