import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class greatestCandies {
    public static void main(String[] args) {
        // write your code here
        int[] candies = { 2, 3, 5, 1, 3 };
        List<Boolean> result = kidsWithCandies(candies, 3);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> temp = new ArrayList<>();
        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandies) {
                temp.add(true);
            } else {
                temp.add(false);
            }
        }
        return temp;
    }
}
