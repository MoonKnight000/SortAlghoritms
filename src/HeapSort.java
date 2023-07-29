public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 3, 5, 8, 6};
        for (int i = 0; i < arr.length; i++) {
            int max = i;
            int j = i + 1;
            while (j < arr.length) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
                j++;
            }
            int change = arr[i];
            arr[i] = arr[max];
            arr[max] = change;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
