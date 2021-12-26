public class shuffleString {
    public static void main(String[] args) {
        // write your code here
        int[] candies = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String s = "codeleet";
        String result = restoreString(s, candies);
        System.out.println(result);
    }

    public static String restoreString(String s, int[] indices) {
        char[] chrArr = s.toCharArray();
        char[] ans = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = chrArr[i];
        }
        return new String(ans);
    }
}
