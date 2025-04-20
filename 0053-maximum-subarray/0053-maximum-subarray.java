class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
    
        for(int i=0; i<nums.length;i++){
            sum+=nums[i];
            if(sum>0){
                if(max<sum){
                    max=sum;
                }
                else{
                    continue;
                }
            }
           else{
                if (max < sum) {  
        max = sum;
    }
        sum=0;
           }

        }
        return max;
    }
}