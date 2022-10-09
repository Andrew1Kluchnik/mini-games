import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GameProcess gameProcess = new GameProcess();
        System.out.println("Игра Камень Ножницы Бумага");
        System.out.println("Введите кол-во раундов:");
        int count = scanner.nextInt();
        for (int i = 0;i<count;i++){
            System.out.println("Выберите: К - Камень, Н - Ножниц, Б - Бумага");
            String variant = scanner.next();
            System.out.println(gameProcess.getResult(variant));
            System.out.println(gameProcess.getScore());
        }
        System.out.println("Игра закончена, результат: " +gameProcess.getScore());

    }
}