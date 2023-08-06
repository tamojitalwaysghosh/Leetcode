class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,k=1,n=nums.length;
        for(int j=1;j<n;j++){
            if(nums[j]==nums[j-1] && k<2){
                k++;
                i++;
                nums[i]=nums[j];
            }
            else if(nums[j]!=nums[j-1]){
                i++;
                nums[i]=nums[j];
                k=1;
            } 
        }
        return i+1;
    }
}
