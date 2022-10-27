package onboarding;

import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> moneyUnit = List.of(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);
        List<Integer> answer = new java.util.ArrayList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0));

        for (int i = 0; i < answer.size(); i++) {
            if (money / moneyUnit.get(i) >= 1) {
                answer.set(i, money / moneyUnit.get(i));
                money %= moneyUnit.get(i);
            }
        }
        return answer;
    }

}
