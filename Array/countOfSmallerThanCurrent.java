import java.util.Arrays;

public class countOfSmallerThanCurrent {
    public static void main(String[] args) {
        // write your code here
        int[] candies = { 8, 1, 2, 2, 3 };
        int[] result = smallerNumbersThanCurrent(candies);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int count = 0;
            int temp = nums[i];
            for (int j = 0; j < size; j++) {
                if (temp > nums[j]) {
                    if (i != j) {
                        count++;
                    }
                }
            }
            result[i] = count;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
