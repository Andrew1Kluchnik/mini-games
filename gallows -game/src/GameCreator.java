import java.util.*;

public class GameCreator {
    private Scanner scanner = new Scanner(System.in);

    private String arrayWords[] = new String[5];
    private List<String> usedLettersList = new ArrayList<String>();
    private String[] shifrWord;
    private String word;
    private int userAttempt = 0;

    public GameCreator() {
        createWords();
    }

    public void gameProcess() {
        word = chooseWord();
        shifrWord = encryptWord(word);
        while (Arrays.asList(shifrWord).contains("_")) {
            showWord(shifrWord);
            System.out.println("Введите букву");
            String letter = scanner.next();
            usedLettersList.add(letter);
            if (checkLetter(letter)&&findLetter(letter)) {
                System.out.println("Вы угадали букву");
            } else System.out.println("попробуйте ещё раз");
        }
        System.out.println("Вы победюкали, кол-во попыток: " + userAttempt);


    }

    public boolean findLetter(String letter) {
        userAttempt++;
        boolean b = false;
        char[] wordChar = word.toCharArray();
        for (int i = 0; i < wordChar.length; i++) {
            if (letter.equals(String.valueOf(wordChar[i]))) {
                shifrWord[i] = letter;
                b = true;
            }
        }
        return b;
    }
    private boolean checkLetter(String letter){
        int count = Collections.frequency(usedLettersList, letter);
        if(count>3)
        {
            System.out.println("Вы уже вводили эту бкуву "+count+" раз");
            return false;
        }
        return true;
    }


    private void createWords() {
        arrayWords[0] = "object";
        arrayWords[1] = "string";
        arrayWords[2] = "wheel";
        arrayWords[3] = "cycle";
        arrayWords[4] = "java";
    }

    private String chooseWord() {
        return arrayWords[new Random().nextInt(4)];
    }

    private String[] encryptWord(String s) {
        String[] arrayLetter = new String[s.length()];
        for (int i = 0; i < arrayLetter.length; i++) {
            arrayLetter[i] = "_";
        }
        return arrayLetter;
    }

    private void showWord(String[] word) {
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i] + " ");
        }
    }
}
