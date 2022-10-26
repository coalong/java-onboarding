package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if (checkPageValid(pobi) || checkPageValid(crong)) {
            return -1;
        }
        if (calHighPage(pobi.get(0), pobi.get(1)) > calHighPage(crong.get(0), crong.get(1))) {
            return 1;
        } else if (calHighPage(pobi.get(0), pobi.get(1)) < calHighPage(crong.get(0), crong.get(1))) {
            return 2;
        } else return 0;
    }

    private static boolean checkPageValid(List<Integer> pageList) {
        return (pageList.get(1) - pageList.get(0) != 1) || pageList.get(0) % 2 != 1 || pageList.get(1) % 2 != 0;
    }

    private static int calHighPage(int oddNum, int evenNum) {
        return Math.max(calHighScore(oddNum), calHighScore(evenNum));
    }

    private static int calHighScore(int pageNum) {
        int sum = 0;
        int mul = 1;

        while (pageNum != 0) {
            sum += pageNum % 10;
            mul *= pageNum % 10;
            pageNum /= 10;
        }
        return Math.max(sum, mul);
    }

}
