import java.util.*;;

class RemoveDuplicatesfromSortedArray69 {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                k++;
                nums[k] = nums[i];

            }

        }
        return k + 1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 3, 3, 3, 4, 5, 5, 6, 7, 7 };
        // printing orginal array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
        System.out.println();
        int k = removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");

        }
    }
}