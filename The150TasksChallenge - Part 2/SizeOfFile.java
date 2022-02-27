package The150TasksChallenge;

import java.io.File;

// Task 45.
public class SizeOfFile {

    public static void main(String[] args) {

        System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
        System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");

    }
}
