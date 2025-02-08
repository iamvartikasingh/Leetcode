class Solution {
    public int searchInsert(int[] nums, int target) 
    {
 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) { 
                return i; // Return the index where target should be inserted
            }
        }
        return nums.length; // If target is greater than all elements, insert at the end
    }
}
