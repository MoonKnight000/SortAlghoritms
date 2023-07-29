public class MargeSort {
     static int[] arr = {89, 3, 9, 4, 6, 6, 32,99};

    public static void main(String[] args) {
        int k = 1;
        while (k < arr.length) {
            for (int i = 0; i < arr.length; i += k * 2) {
               sortLittleArrays( i, Math.min(i + k * 2, arr.length));
            }
            k++;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sortLittleArrays(int i, int j) {
        for (int k = i; k < j; k++) {
            for (int l = k + 1; l < j; l++) {
                if (arr[k] < arr[l]) {
                    int change = arr[k];
                    arr[k] = arr[l];
                    arr[l] = change;
                }
            }
        }
    }
}
