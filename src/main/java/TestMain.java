import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Solutions solutions = new Solutions();
        //System.out.println(solutions.isPalindrome("Was it a car or a cat I saw?"));

        //day1 [stack] - 9/12/24
        //https://leetcode.com/problems/daily-temperatures/
        //System.out.println(Arrays.toString(solutions.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));

        //day2 [stack] - 10/12/24
        //https://leetcode.com/problems/car-fleet/
        //System.out.println(solutions.carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}));

        //day3 [stack] - 11/12/24
        //https://leetcode.com/problems/largest-rectangle-in-histogram/description/
        //System.out.println(solutions.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));

        //day4 [binary search] - 12/12/24
        //https://leetcode.com/problems/binary-search/description/
        System.out.println(solutions.binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }
}
