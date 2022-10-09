import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class GameProcess {
    private int userScore = 0;
    private int computerScore = 0;
    private Random random = new Random(4);
    private List<String> listOfVariants = new ArrayList();

    public GameProcess() {
        creator();
    }

    public String getResult(String userChoice) {
        return comput(userChoice);
    }

    public String comput(String userChoise) {
        int num = random.nextInt(3);
        String computerChoise = listOfVariants.get(num);
        switch (computerChoise) {
            case "К":
                if (computerChoise.equals("К") & !Objects.equals(userChoise, "Б")) {
                    computerScore += 1;
                    return "Компьютер победил";
                } else if (computerChoise.equals("К") & Objects.equals(userChoise, "К")) {
                    return "Нужно переиграть";

                } else {
                    userScore += 1;
                    return "Вы победили";
                }
            case "Н":
                if (computerChoise.equals("Н") & !Objects.equals(userChoise, "К")) {
                    computerScore += 1;
                    return "Компьютер победил";
                } else if (computerChoise.equals("Н") & userChoise.equals("Н")) {
                    return "Нужно переиграть";

                } else {
                    userScore += 1;
                    return "Вы победили";
                }
            case "Б":
                if (computerChoise.equals("Б") & !Objects.equals(userChoise, "Н")) {
                    computerScore += 1;
                    return "Компьютер победил";
                } else if (computerChoise.equals("Б") & userChoise.equals("Б")) {
                    return "Нужно переиграть";

                } else {
                    userScore += 1;
                    return "Вы победили";
                }
        }
        return null;
    }

    public void creator() {
        listOfVariants.add("К");
        listOfVariants.add("Н");
        listOfVariants.add("Б");
    }

    public String getScore() {
        return "Ваши очки: " + userScore + "\n"
                + "Очки компьютера: " + computerScore;
    }
}
