package Files;
// Task 2
import java.io.File;

public class listFilesWithExtensions {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\V\\Desktop\\My things");

        String[] fileList = file.list();

        if (fileList != null) {
            for (String name:fileList){
                if (file.isDirectory()) {
                    System.out.println(name);
                }
            }
        }
    }
}
