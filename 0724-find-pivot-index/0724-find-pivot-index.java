class Solution {
    public int pivotIndex(int[] nums) {
        int suff = 0;
        for (int i =0;i<nums.length;i++){
            suff =  suff+ nums[i];
        }
        int prif=0;
        for (int i=0;i<nums.length;i++ ){
            suff= suff-nums[i];
            if (suff==prif)return i;
             prif= prif+nums[i];
        }
        return -1;
    }
}