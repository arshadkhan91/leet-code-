class Solution {
    public void moveZeroes(int[] nums) {
        int i =0;
        int j=nums.length;
        while (i<nums.length){
            if(nums[i]==0) break;
            i++;
        }
        j=i+1;
        while(j<nums.length){
            if(nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++;
            }
            j++;

        }

    }
}