import java.util.HashMap;

public class goodPairs {
    public static void main(String[] args) {
        // write your code here
        int[] candies = { 1, 2, 3, 1, 1, 3 };
        int result = numIdenticalPairs(candies);
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                count += mp.get(nums[i]);
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } else {
                mp.put(nums[i], 1);
            }
        }
        System.out.println(count);
        return count;
    }
}
