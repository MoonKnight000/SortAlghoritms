public class MargeSort {
    public static void main(String[] args) {
        int[] arr = {89, 3, 9, 4, 6, 6, 32,99};
        int k = 1;
        while (k < arr.length) {
            for (int i = 0; i < arr.length; i += k * 2) {
                arr = sortLittleArrays(arr, i, Math.min(i + k * 2, arr.length));
            }
            k++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sortLittleArrays(int[] arr, int i, int j) {
        for (int k = i; k < j; k++) {
            for (int l = k + 1; l < j; l++) {
                if (arr[k] < arr[l]) {
                    int change = arr[k];
                    arr[k] = arr[l];
                    arr[l] = change;
                }
            }
        }
        return arr;
    }
}
