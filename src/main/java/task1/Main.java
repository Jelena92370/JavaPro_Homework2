package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String randomWord = UtilityClass.generateWord(8);
        System.out.println("Random Word: " + randomWord);

        String randomNumeric = UtilityClass.generateNumeric(6);
        System.out.println("Random Numeric: " + randomNumeric);

        String input1 = "Я люблю Java!";
        String[] splitResult1 = UtilityClass.splitByFirst(input1);
        System.out.println("Split Result 1: " + Arrays.toString(splitResult1));

        String input2 = "Люди! Я люблю Java! Ура!";
        String[] splitResult2 = UtilityClass.splitByFirst(input2);
        System.out.println("Split Result 2: " + Arrays.toString(splitResult2));

        String numericString = "12345";
        boolean isNumeric = UtilityClass.isNumeric(numericString);
        System.out.println("Is Numeric: " + isNumeric);
    }
}
