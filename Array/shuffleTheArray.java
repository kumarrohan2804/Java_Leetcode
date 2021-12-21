import java.util.Arrays;

public class shuffleTheArray {
    public static void main(String[] args) {
        // write your code here
        int[] operations = { 2, 5, 1, 3, 4, 7 };
        int[] result = shuffle(operations, 3);
        System.out.println(result);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] temp = new int[2 * n];
        int count = 0;
        int x = 0;
        int y = n;
        for (int i = 0; i < n; i++) {
            temp[count] = nums[x];
            temp[count + 1] = nums[y];
            count = count + 2;
            x++;
            y++;
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }
}
