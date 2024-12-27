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
        //System.out.println(solutions.binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9));

        //day6 [binary search] - 16/12/2024
        //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
        //System.out.println(solutions.findMin(new int[]{4,5,6,7,0,1,2}));

        //day7 [binary search] - 20/12/2024
        //https://leetcode.com/problems/time-based-key-value-store/
        /*
        TimeMap timeMap = new TimeMap();
        timeMap.set("alice", "happy", 1);  // store the key "alice" and value "happy" along with timestamp = 1.
        System.out.println(timeMap.get("alice", 1));          // return "happy"
        System.out.println(timeMap.get("alice", 2));           // return "happy", there is no value stored for timestamp 2, thus we return the value at timestamp 1.
        timeMap.set("alice", "sad", 3);    // store the key "alice" and value "sad" along with timestamp = 3.
        System.out.println(timeMap.get("alice", 3));           // return "sad"
        */

        //day8 [sliding window] - 23/12/2024
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
        //System.out.println(solutions.maxProfit(new int[]{7,1,5,3,6,4}));

        //day9 [sliding window] - 25/12/2024
        //https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
        //System.out.println(solutions.lengthOfLongestSubString("abc"));

        //day10 [sliding window] - 27/12/2024
        //https://leetcode.com/problems/longest-repeating-character-replacement/
        System.out.println(solutions.characterReplacement("ABAB", 2));
    }
}
