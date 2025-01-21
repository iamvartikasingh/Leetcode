class Solution {
    public int removeDuplicates(int[] nums) {
       
         int k=1;
         int p=nums.length;
         
         for(int i=0;i<p;i++){ 
            if (nums[i]!=nums[k-1]){
                nums[k] = nums[i];
           k++;
         }

           
         }

         return k;
    }
}