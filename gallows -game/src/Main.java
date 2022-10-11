public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Игра виселица:");
        GameCreator gameCreator = new GameCreator();
        gameCreator.gameProcess();
        System.out.println("Вы потрaтили на это:"+ (System.currentTimeMillis() - startTime)/1000+" секунд");

    }
}