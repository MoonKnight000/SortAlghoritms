public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 9, 1, 5, 2, 9};
        for (int i = 0; i < nums.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] <= nums[min])
                    min = j;
            int a = nums[min];
            nums[min] = nums[i];
            nums[i] = a;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
