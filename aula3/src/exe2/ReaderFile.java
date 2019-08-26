package exe2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderFile extends Thread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.printf("Informe o caminho do arquivo texto:\n");
            Scanner read = new Scanner(System.in);
            String title = read.nextLine();
            FileReader file = new FileReader(title);
            BufferedReader fileRead = new BufferedReader(file);

            String line = fileRead.readLine();
            while (line != null) {
                System.out.printf("%s\n", line);
                Thread.sleep(10000);
                line = fileRead.readLine();
            }
            file.close();
        } catch (InterruptedException err) {
            System.out.println("Thread de Leitura de arquivo foi interrompida. ID: " + Thread.currentThread().getId());
            err.printStackTrace();

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReaderFile reader = new ReaderFile();
        reader.start();
    }
}
