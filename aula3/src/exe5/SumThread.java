package exe5;
import javax.swing.*;
import java.util.Scanner;

public class SumThread extends Thread implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        Scanner number = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores a serem somados:");
        int len = Integer.parseInt(number.nextLine());
        while(len != 0){
            System.out.println("Digite um numero:");
            sum += Integer.parseInt(number.nextLine());
            len -= 1;
        }
        System.out.println("Soma: " + sum);
    }

    public static void main(String[] args) throws InterruptedException {
        SumThread thread = new SumThread();
        thread.start();
        thread.join();
        System.out.println("Soma finalizada...");
    }
}
