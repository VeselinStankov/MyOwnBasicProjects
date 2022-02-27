package The150TasksChallenge;

import java.nio.charset.Charset;

// Task 40.
public class CharacterSets {

    public static void main(String[] args) {
        System.out.println("List of available character sets: ");
        for (String str: Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
}
