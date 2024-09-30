public class Main {

    public static void main(String[] args) {
        boolean parenthese = parenthesesCheck(")(()))");
        System.out.println(parenthese);

        String reverseNum = reverseInteger(1423);
        System.out.println(reverseNum);

        String encrypted = encryptThis("Hello good day");
        System.out.println(encrypted);

        System.out.println("82yade 115te 103o");
        String decipher = decipherThis("82yade 115te 103o");
        System.out.println(decipher);
        

    }

    // 1. parenthesesCheck

    public static boolean parenthesesCheck(String parentheses) {
        if (parentheses.charAt(0) != parentheses.charAt(parentheses.length() - 1)) {
            return true;
        }
        return false;
    }

    // 2. reverseInteger
    public static String reverseInteger(int num) {
        String reverse = "";
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse + digit;
            num = num / 10;

        }
        return reverse;
    }

    // 3. encryptThis
    public static String encryptThis(String message) {
        String result = "";
        String currentWord = "";

        for (int i = 0; i <= message.length(); i++) {
            char currentChar;
            if (i < message.length()) {
                currentChar = message.charAt(i);
            } else {
                currentChar = ' ';
            }

            if (currentChar == ' ') {
                if (!currentWord.isEmpty()) {

                    int hexCode = (int) currentWord.charAt(0);
                    String encryptedWord = (hexCode + "");

                    if (currentWord.length() > 1) {
                        char secondChar = currentWord.charAt(1);
                        char lastChar = currentWord.charAt(currentWord.length() - 1);

                        encryptedWord += lastChar;
                        encryptedWord += currentWord.substring(2, currentWord.length() - 1);
                        encryptedWord += secondChar;
                    }

                    result += encryptedWord + " ";
                    currentWord = "";
                }
            } else {
                currentWord += currentChar;
            }
        }
        return result;
    }

    // 4. decipherThis
    public static String decipherThis(String message) {
        String result = "";
        String currentWord = "";

        for (int i = 0; i <= message.length(); i++) {
            char currentChar;
            if (i < message.length()) {
                currentChar = message.charAt(i);
            } else {
                currentChar = ' ';
            }

            if (currentChar == ' ' || currentChar == '\0') {
                if (!currentWord.isEmpty()) {

                    int index = 0;
                    int ascii = 0;

                    System.out.println(currentWord);
                    while (index < currentWord.length() && Character.isDigit(currentWord.charAt(index))) {
                        System.out.println(ascii+ "ascii 0");
//                        if (index >= 1){
////                            ascii *=10;
//                            System.out.println("hello" +ascii);
//                        }
                        char word = currentWord.charAt(index);
                        ascii = (int) word;

                        System.out.println(currentWord.charAt(index));
                        System.out.println(word);
                        index++;
//                        System.out.println("hi" + ascii);
                    }
                    Character.toString(ascii);
                    System.out.println(ascii);

//                    char firstChar = (char) Integer.parseInt(asciiPart);
//                    String decipheredWord = firstChar + "";
//
//                    if (currentWord.length() > index) {
//                        char secondChar = currentWord.charAt(index);
//                        char lastChar = currentWord.charAt(currentWord.length() - 1);
//
//                        decipheredWord += secondChar;
//                        decipheredWord += currentWord.substring(2, currentWord.length() - 1);
//                        decipheredWord += lastChar;
//                    }

//
//                    result += decipheredWord + " ";
//                    currentWord = "";
                }
            } else {
                currentWord += currentChar;
            }
        }

        return result.trim();
    }

}






