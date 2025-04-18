import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int capacity = (int)(nums.length / 0.75f) + 1;
        HashSet<Integer> seen = new HashSet<>();

   for (int num : nums) {
            if (!seen.add(num)) {
                return true; // duplicate found
            }
        }

return false;
        }
    
}
