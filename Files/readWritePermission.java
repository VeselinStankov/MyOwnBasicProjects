package Files;

import java.io.File;
import java.util.Date;

// Task 4
public class readWritePermission {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\V\\Desktop\\My things\\New Text Document.txt");
        Date date = new Date(file.lastModified());

        System.out.println(file.canRead());
        System.out.println(date);
    }
}
