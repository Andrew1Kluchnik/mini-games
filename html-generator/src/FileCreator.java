import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FileCreator {
    private Scanner scanner = new Scanner(System.in);
    private File file;
    private FileOutputStream fileOutputStream;
    String preparedString = " ";
    private String tag = "";
    private String result = "";

    public FileCreator() throws FileNotFoundException {
        file = new File("index.html");
        fileOutputStream = new FileOutputStream(file);
    }

    public void write() {
        while (!Objects.equals(tag, ".")) {
            System.out.println("Введите тег, например H1");
            tag = scanner.nextLine();
            System.out.println("Введите сообщение: ");
            String message = scanner.nextLine();
            preparingMessage(tag, message);
        }
        try {
            fileOutputStream.write(result.getBytes());
            fileOutputStream.close();
            Desktop.getDesktop().browse(file.toURI());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private void preparingMessage(String tag, String message) {
        result += (preparingTag().get(0) + message + preparingTag().get(1) + "\n");
    }

    private List<String> preparingTag() {
        List<String> list = new ArrayList<>();
        list.add("<" + tag + ">");
        list.add("</" + tag + ">");
        return list;
    }

    private void prepareStringToWriting(String s) {

    }


}
