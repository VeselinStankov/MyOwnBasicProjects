package Files;

import java.io.File;

// Task 1
public class listOfFileNames {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\V\\Desktop\\My things");

        String[] fileList = file.list();

        if (fileList != null) {
            for (String name:fileList){
                System.out.println(name);
            }
        }

    }
}
