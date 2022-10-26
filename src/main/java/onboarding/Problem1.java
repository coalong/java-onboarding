package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if (checkPageValid(pobi) || checkPageValid(crong)) {
            return -1;
        }


        return 0;
    }

    static boolean checkPageValid(List<Integer> pageList) {
        return (pageList.get(1) - pageList.get(0) != 1) || pageList.get(0) % 2 != 1 || pageList.get(1) % 2 != 0;
    }

}
