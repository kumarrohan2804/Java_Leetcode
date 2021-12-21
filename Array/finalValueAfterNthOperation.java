// ++X --> +1
// --X --> -1
// return the net result after the traversing sarray of string X start from 0

public class finalValueAfterNthOperation {
    public static void main(String[] args) {
        // write your code here
        String[] operations = { "--X", "X++", "X++" };
        int result = finalValueAfterOperations(operations);
        System.out.println(result);
    }

    public static int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (operations[i].contains("++"))
                x++;
            else
                x--;
        }
        return x;
    }
}
