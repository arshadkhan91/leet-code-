class Solution {
    public int pivotIndex(int[] nums) {
         int total=0;
         for(int i=0;i<nums.length;i++){
            total=total+nums[i];
         }
         int prifix=0;
         int suffix=total;
         for(int i=0;i<nums.length;i++){
            suffix=suffix-nums[i];
            if(suffix==prifix)return i;
            prifix=prifix+nums[i] ;
         }
       return -1;
    }
}