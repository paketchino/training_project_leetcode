package leetcode;

public class checkIfExsists {

    public static boolean checkIfExists(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {10, 2, 5, 3};
        int[] arr2 = new int[] {7, 1, 14, 11};
        int[] arr3 = new int[] {3, 1, 7, 11};
        int[] arr4 = new int[] {-2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExists(arr4));
        System.out.println(checkIfExists(arr3));
        System.out.println(checkIfExists(arr2));
        System.out.println(checkIfExists(arr));
    }
}
