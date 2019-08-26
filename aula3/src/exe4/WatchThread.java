package exe4;
import exe1.RandomFinishThread;
import exe2.ReaderFile;

public class WatchThread extends Thread {
    public static void main(String[] args) throws InterruptedException {
        RandomFinishThread thread1 = new RandomFinishThread();
        ReaderFile thread2 = new ReaderFile();

        thread1.start();
        thread2.start();

        while (true){
            if(thread1.isInterrupted()){
                System.out.println("Thread de RandomFinish foi interrompida. ID: " + Thread.currentThread().getId());
                throw new InterruptedException();
            }

            if(thread2.isInterrupted()) {
                System.out.println("Thread de Leitura de arquivo foi interrompida. ID: " + Thread.currentThread().getId());
                throw new InterruptedException();
            }
        }
    }
}
