import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        GameProcess gameProcess = new GameProcess();
        System.out.println("Игра Камень Ножницы Бумага");
        System.out.println("До скольки побед играем?");
        int count = scanner.nextInt();
        while (gameProcess.getUserScore() < count & gameProcess.getComputerScore() < count) {
            System.out.println("Выберите: К - Камень, Н - Ножниц, Б - Бумага");
            String variant = scanner.next();
            System.out.println(gameProcess.getResult(variant));
            System.out.println(gameProcess.getScore());
        }
        System.out.println("Игра закончена, результат: " + gameProcess.getScore());
        System.out.println("Времени было потрачено зря: " + (System.currentTimeMillis() - time) / 1000);

    }
}