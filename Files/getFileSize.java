package Files;

import java.io.File;

// Task 6
public class getFileSize {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\V\\Desktop\\My things\\New Text Document.txt");

        System.out.println(file.length());
    }
}
