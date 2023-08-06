class Solution {
    public boolean check(int[] nums) {
        int i=0,k=0,n=nums.length;
        while(i<n){ 
            if(nums[i]>nums[(i+1)%n]){
                k++;
            }
            if(k>1){
                return false;
            }
            i=(i+1);
        }
        return true;
    }
}
