class Solution {
 public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        
        int[][] numsWithIndices = new int[n][2];
        for (int i = 0; i < n; i++) {
            numsWithIndices[i][0] = nums[i];  
            numsWithIndices[i][1] = i;       
        }

        // Sort the array by values
        Arrays.sort(numsWithIndices, (a, b) -> Integer.compare(a[0], b[0]));

        // Two-pointer approach
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = numsWithIndices[left][0] + numsWithIndices[right][0];
            if (sum == target) {
                return new int[] {numsWithIndices[left][1], numsWithIndices[right][1]};
            } else if (sum < target) {
                left++;  // Move left pointer to increase sum
            } else {
                right--; // Move right pointer to decrease sum
            }
        }

        // If no solution found (problem guarantees a solution exists)
        throw new IllegalArgumentException("No two sum solution");
    }
}