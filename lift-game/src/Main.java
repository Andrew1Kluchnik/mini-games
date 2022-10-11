import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        GameProcessing gameProcessing = new GameProcessing();
        Thread thread = new Thread(gameProcessing);
        thread.run();
        thread.interrupt();



    }
}