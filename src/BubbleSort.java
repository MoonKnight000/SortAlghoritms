public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 952, 82, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int change = arr[i];
                    arr[i] = arr[j];
                    arr[j] = change;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
