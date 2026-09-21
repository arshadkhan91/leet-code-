class Solution {
    public int[] leftRightDifference(int[] nums) {
        int right= 0;
        for(int i =0;i<nums.length;i++){
            right=right+nums[i];
        }
        int left =0;
        for(int i =0;i<nums.length;i++){
            right=right-nums[i];
            int temp=right-left;
            left=left+nums[i];
            nums[i]=Math.abs(temp); 
        }
        return nums;
    }
}