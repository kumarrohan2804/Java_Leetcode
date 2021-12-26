import java.util.ArrayList;

public class encodedList {
    public static void main(String[] args) {
        // write your code here
        int[] candies = { 1, 2, 3, 4 };
        int[] result = decompressRLElist(candies);
    }

    public static int[] decompressRLElist(int[] nums) {
        int size = nums.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < size; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                temp.add(val);
            }
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }
}
