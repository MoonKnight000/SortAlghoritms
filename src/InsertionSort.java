public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 6, 1, 10};
        for (int i = 1; i < arr.length; i++) {
            int com = arr[i];
            int j = i - 1;
            if (arr[j] > arr[i]) {
                while (j >= 0 && arr[j] > com) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = com;
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
