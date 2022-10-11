import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameProcessing implements Runnable {
    private List<String> floorList = new ArrayList();
    private int floor = 0;
    private int currentFloor;
    private Scanner scanner = new Scanner(System.in);

    public void startGame(int countFloor) throws InterruptedException {

    }

    private void creator(int countFloor) {
        for (Integer i = 1; i < countFloor + 1; i++) {

            floorList.add(i.toString());
        }
    }

    @Override
    public void run() {
        System.out.println("Введите кол-во этажей:");
        creator(scanner.nextInt());
        currentFloor = 0;
        for (String s : floorList) {
            System.out.printf(s + " ");
        }
        while (floor != 164) {
            System.out.println(" ");
            System.out.println("На какой этаж поедем?");
            floor = scanner.nextInt();
            if (floor <= floorList.size() & floor > 0) {
                while (currentFloor != floor) {
                    if (currentFloor < floor) {
                        for (int i = currentFloor; i < floor; i++) {
                            String s = floorList.get(i);
                            floorList.set(i, "{" + floorList.get(i) + "}");
                            for (String s1 : floorList) {
                                System.out.print(s1 + " ");
                            }
                            try {
                                Thread.sleep(600);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            floorList.set(i, s);
                        }
                        currentFloor = floor;


                    } else if (currentFloor > floor) {
                        System.out.println(currentFloor + "currentFLOOR");
                        for (int i = currentFloor - 1; i > floor - 2; i--) {
                            String s = floorList.get(i);
                            floorList.set(i, "{" + floorList.get(i) + "}");
                            for (String s1 : floorList) {
                                System.out.print(s1 + " ");
                            }
                            try {
                                Thread.sleep(600);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            floorList.set(i, s);
                        }
                        currentFloor = floor;

                    }
                }
                System.out.println("Вы уже на этом этаже");

            } else System.out.println("Вы не можете поехать на этот этаж(");

        }
    }
}
