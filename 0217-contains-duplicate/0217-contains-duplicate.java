import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

   for (int num : nums) {
            if (!seen.add(num)) {
                return true; // duplicate found
            }
        }

return false;
        }
    
}
