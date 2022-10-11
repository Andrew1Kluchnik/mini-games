import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameController {
    List<String> wordsList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public GameController(){
        createWords();
    }
    public String getResult(){
        String word = chooseWord();
        char secretWord[] = word.replaceAll("\\D","_" ).toCharArray();
        while (true){
            System.out.println("Ваше слово: ");
            for (int i = 0;i<secretWord.length;i++) {
                System.out.print(secretWord[i]+" ");
            }
            System.out.println("Введите букву: ");
            if(isTrue(scanner.next())){
                word.
            }
            break;
        }
        return null;
    }

    private String chooseWord(){
        Random random = new Random();
        return wordsList.get(random.nextInt(6));
    }
    private void createWords(){
        wordsList.add("Beer");
        wordsList.add("Bread");
        wordsList.add("Consumer");
        wordsList.add("Banana");
        wordsList.add("Solution");
        wordsList.add("Java");
    }
}
