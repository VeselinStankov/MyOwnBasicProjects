package The150TasksChallenge;
// Task 20.
import java.util.Locale;
import java.util.Scanner;

public class ConvertDecimalToHexadecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        String result = Integer.toHexString(a);

        System.out.println(result.toUpperCase(Locale.ROOT));
    }
}
