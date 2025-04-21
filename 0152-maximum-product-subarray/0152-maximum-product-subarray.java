class Solution {
    public int maxProduct(int[] nums) {
      
        int result = nums[0];
        int p = 1;

        for (int i = 0; i < nums.length; i++) {
            p *= nums[i];
            result = Math.max(result, p);
            if (p == 0) p = 1; 
        }

        p = 1; 
        for (int i = nums.length - 1; i >= 0; i--) {
            p *= nums[i];
            result = Math.max(result, p);
            if (p == 0) p = 1;
        }

        return result;
    }
}
   