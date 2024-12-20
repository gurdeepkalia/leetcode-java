import java.util.Arrays;
import java.util.Stack;

public class Solutions {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!stack.empty() && t > stack.peek()[0]) {
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t, i});
        }
        return res;
    }

    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];
        Stack<Double> stack = new Stack<>();

        //populate the pair [position, speed]
        for (int i = 0; i<position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        //sort the pair array in decreasing order of position value
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));

        for (int[] pair : pairs) {
            stack.push((double)(target-pair[0])/pair[1]);
            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size()-2)) {
                stack.pop();
            }
        }
        return stack.size();
    }

    public int largestRectangleArea(int[] height) {
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i<height.length; i++) {
            int currIndex = i;
            while (!stack.empty() && stack.peek()[1] > height[i]) {
                int[] pair = stack.pop();
                int area = (i-pair[0]) * pair[1];
                maxArea = Math.max(maxArea, area);
                currIndex = pair[0];
            }
            stack.push(new int[]{currIndex, height[i]});
        }

        for (int[] pair : stack) {
            int area = (height.length - pair[0]) * pair[1];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid;
        int res = -1;

        while (start <= end) {
            mid = (start + end)/2;
            if (target < nums[mid]) {
                end = mid-1;
            } else if (target > nums[mid]) {
                start = mid+1;
            } else {
                res = mid;
                break;
            }
        }
        return res;
    }

    public int findMin(int[] nums) {
        //[4,5,6,7,0,1,2]
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return nums[l];
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
