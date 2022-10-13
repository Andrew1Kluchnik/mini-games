import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        FileCreator fileCreator = new FileCreator();
        fileCreator.write();
    }
}