class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightSum= 0;
        for (int i =0;i<nums.length;i++){
            rightSum= rightSum+nums[i];
        }
        int leftSum =0;
        for (int i=0;i<nums.length;i++){
            rightSum=rightSum-nums[i];
            int n= nums[i];
            nums[i]=Math.abs(rightSum-leftSum);
            leftSum=leftSum+n;
        }
        return nums;
    }
}