package task1;

public class UtilityClass {

    private UtilityClass() {}

    public static String generateWord(int length) {
                    StringBuilder word = new StringBuilder();
            for (int i = 0; i < length; i++) {
                char randomChar = (char) ('a' + i % 26);
                word.append(randomChar);
            }
            return word.toString();
}
    public static String generateNumeric(int length) {
        StringBuilder numeric = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomDigit = (char) ('0' + Math.random() * 10);
            numeric.append(randomDigit);
        }
        return numeric.toString();
}
    public static String[] splitByFirst(String input) {
        String[] result = new String[2];
        int index = 0;
        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                result[0] = input.substring(0, index).trim();
                result[1] = input.substring(index).trim();
                return result;
            }
            index++;
        }
        result[0] = input;
        result[1] = "";
        return result;
    }
    public static boolean isNumeric(String input) {
        return input.matches("\\d+");
    }


}
