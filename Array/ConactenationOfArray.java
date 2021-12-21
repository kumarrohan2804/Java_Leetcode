// return array should be : [given_arr, given_arr];

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] nums = { 1, 3, 2, 1 };
        int[] result = getConcatenation(nums);
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            ans[i] = nums[i % n];
        }
        return ans;
    }
}
