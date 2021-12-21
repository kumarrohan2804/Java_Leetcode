// return an array after running the sum uptill i

public class runningSum {
    public static void main(String[] args) {
        // write your code here
        int[] operations = { 1, 2, 3, 4 };
        int[] result = extFunc(operations);
    }

    public static int[] extFunc(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        temp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            temp[i] = temp[i - 1] + nums[i];
        }
        return temp;
    }
}
