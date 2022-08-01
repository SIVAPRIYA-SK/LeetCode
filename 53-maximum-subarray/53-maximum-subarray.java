class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int max=Integer.MIN_VALUE;
        
        for(int num: nums){
            curr = Math.max(curr+num, num);
            max=Math.max(max,curr);
        }
        return max;
    }
}