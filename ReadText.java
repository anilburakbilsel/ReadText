import java.io.File;
import java.util.Scanner;

public class ReadText {
    public static void main(String [] args) throws Exception{
        File file = new File("easy.txt");
        Scanner scanner = new Scanner(file);
        int wordCount = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            wordCount += line.split(" ").length;
        }

        System.out.println("the total words in the file is equal to " + wordCount);
    }
}
