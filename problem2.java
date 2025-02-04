class Solution {
    public int findMin(int[] nums) {
        if(nums==null || nums.length==0){
            return -1;
        }
        int low=0;
        int high=nums.length -1;
        while(low<=high){
            if(nums[low]<=nums[high]){
                return nums[low];
            }
            int mid=low+(high-low)/2;
            if((mid==0 || nums[mid-1]>nums[mid])&&(mid==nums.length-1 || nums[mid+1]>nums[mid])){
                return nums[mid];
                }
            if(nums[low]<=nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
                
            
        } 
        return 999; // there will always be a minimum value
    } 
    
}