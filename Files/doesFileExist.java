package Files;
// Task 3
import java.io.File;

public class doesFileExist {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\V\\Desktop\\My things\\New Text Document.txt");

        System.out.println(file.exists());

    }
}
