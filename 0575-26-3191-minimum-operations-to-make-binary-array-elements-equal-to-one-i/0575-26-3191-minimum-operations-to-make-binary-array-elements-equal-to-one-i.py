class Solution:
    def minOperations(self, nums: List[int]) -> int:
        n = len(nums)
        flips = 0  

        for i in range(n - 2):
            if nums[i] == 0:
                nums[i] = 1
                nums[i + 1] = 1 - nums[i + 1]  # Flip 0 -> 1, 1 -> 0
                nums[i + 2] = 1 - nums[i + 2]  # Flip 0 -> 1, 1 -> 0
                flips += 1  

        if 0 in nums:
            return -1
        
        return flips