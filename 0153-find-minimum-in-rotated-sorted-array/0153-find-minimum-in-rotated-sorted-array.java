class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        int result=nums[0];
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[l]<=nums[r]){
                result=Math.min(result,nums[l]);
                break;
            }
        result=Math.min(result, nums[mid]);
        if(nums[l]<=nums[mid]){
            l=mid+1;
        }
        else{
            r=mid-1;
        }
        }
        return result;
    }
}