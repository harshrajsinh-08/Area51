import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class wordcount {
    
    public static String readFile(String filePath) throws FileNotFoundException {
        String content = "";
        Scanner sc = new Scanner(new File(filePath));
    
        while (sc.hasNextLine()) {
            content = content + sc.nextLine() + "\n";
        }
        return content;
    }
    
    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String filePath = ""; //YAHA FILE PATH TERA DAALNA HAI 
        // for eg : "/User/Sanchita/xyz/area51/attackearth.txt"

        try {
            String content = readFile(filePath);
            int wordCount = countWords(content);
            System.out.println("Number of words : " + wordCount);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: ");
        }
    }

}
