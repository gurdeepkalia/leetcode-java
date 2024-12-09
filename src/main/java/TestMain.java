import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Solutions solutions = new Solutions();
        //System.out.println(solutions.isPalindrome("Was it a car or a cat I saw?"));

        //day1 [stack]
        //https://leetcode.com/problems/daily-temperatures/
        System.out.println(Arrays.toString(solutions.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}
