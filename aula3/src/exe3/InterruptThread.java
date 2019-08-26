package exe3;

import exe1.RandomFinishThread;
import exe2.ReaderFile;

public class InterruptThread extends Thread implements Runnable {
    @Override
    public void run() {
        RandomFinishThread thread1 = new RandomFinishThread();
        ReaderFile thread2 = new ReaderFile();

        thread1.start();
        thread2.start();

        thread1.interrupt();
        thread2.interrupt();

    }

    public static void main(String[] args) {
        InterruptThread thread = new InterruptThread();
        thread.start();
    }
}
