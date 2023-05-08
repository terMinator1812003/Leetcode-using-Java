public class SortColors_74 {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        int ans = sortColors(nums);
        System.out.println(ans);
    }

    public static int sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return -1;
    }
}
