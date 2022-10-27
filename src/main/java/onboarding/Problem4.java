package onboarding;

public class Problem4 {
    public static String solution(String word) {
        StringBuilder answer = new StringBuilder();
        char[] wordSplit = word.toCharArray();
        for (char token : wordSplit) {
            if (Character.isUpperCase(token)) {
                answer.append(convertUpperAlphabet(token));
            } else if (Character.isLowerCase(token)) {
                answer.append(convertLowerAlphabet(token));
            } else answer.append(token);
        }
        return answer.toString();
    }

    static char convertUpperAlphabet(char token) {
        return (char)(25 - (token - 65) + 65);
    }

    static char convertLowerAlphabet(char token) {
        return (char)(25 - (token - 97) + 97);
    }
}
