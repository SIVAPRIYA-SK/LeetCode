class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) return;
        int i = nums.length - 2;                   // Creating Breaking point 'i'
        while (i>=0 && nums[i] >= nums[i+1]) i--; //Moving breaking point 'i' before the present breakpoint index
        if(i>=0) {                                // if there is a breakpoint
            int j=nums.length - 1;               // Creating another index 'j' pointing at last element in the array
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverse(int[] nums, int i, int j) {
        while(i < j) swap(nums, i++, j--);
    }
}