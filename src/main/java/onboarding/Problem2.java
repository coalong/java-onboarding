package onboarding;

import java.util.LinkedList;
import java.util.List;

public class Problem2 {
    public static String solution(String cryptogram) {
        StringBuilder answer = new StringBuilder();
        LinkedList<Character> cryptogramChar = new LinkedList<>(List.of('A'));
        int index = 0;

        for (int i = 0; i < cryptogram.length(); i++) {
            if (cryptogramChar.get(index).equals(cryptogram.charAt(i))) {
                cryptogramChar.remove(index);
                index--;
            } else {
                cryptogramChar.add(cryptogram.charAt(i));
                index++;
            }
        }

        cryptogramChar.remove(0);
        for (Character character : cryptogramChar) {
            answer.append(character);
        }
        return answer.toString();
    }
}
