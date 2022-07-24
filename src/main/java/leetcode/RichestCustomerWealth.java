package leetcode;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int maxNumberOfArray = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > maxNumberOfArray) {
                maxNumberOfArray = sum;
            }
        }
        return maxNumberOfArray;
    }

    public static void main(String[] args) {
        int[][] accounts = new int[][] {{1, 2, 3}, {1, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }
}
