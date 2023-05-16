class Find_the_Duplicate_Number_287_Cyclicsort{
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2}; // Example array
        Find_the_Duplicate_Number_287_Cyclicsort solution = new Find_the_Duplicate_Number_287_Cyclicsort();
        int duplicate = solution.findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicate);
    }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i]!=i+1){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                return nums[i];
            }
        }
        else{
            i++;
        }
        }
        return -1;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
}