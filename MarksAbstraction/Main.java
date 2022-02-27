package MarksAbstraction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentA studentA = new StudentA();
        studentA.setMathMark(Double.parseDouble(scanner.nextLine()));
        studentA.setBiologyMark(Double.parseDouble(scanner.nextLine()));
        studentA.setEnglishMark(Double.parseDouble(scanner.nextLine()));
        studentA.message(studentA.getPercentage());

        StudentB studentB = new StudentB();
        studentB.setMathMark(Double.parseDouble(scanner.nextLine()));
        studentB.setBiologyMark(Double.parseDouble(scanner.nextLine()));
        studentB.setEnglishMark(Double.parseDouble(scanner.nextLine()));
        studentB.setChemistryMark(Double.parseDouble(scanner.nextLine()));
        studentB.message(studentB.getPercentage());

    }
}
