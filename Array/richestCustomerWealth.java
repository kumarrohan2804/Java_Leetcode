public class richestCustomerWealth {
    public static void main(String[] args) {
        // write your code here
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int result = maximumWealth(accounts);
        System.out.println(result);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int row = accounts.length;
        int col = accounts[0].length;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
