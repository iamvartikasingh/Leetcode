class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []
        
        for c in range(len(nums) - 2):
            # Skip duplicate fixed numbers
            if c > 0 and nums[c] == nums[c - 1]:
                continue
            
            l, r = c + 1, len(nums) - 1
            
            while l < r:
                total = nums[c] + nums[l] + nums[r]
                
                if total < 0:
                    l += 1
                elif total > 0:
                    r -= 1
                else:
                    res.append([nums[c], nums[l], nums[r]])
                    # Skip duplicate pairs
                    while l < r and nums[l] == nums[l + 1]:
                        l += 1
                    while l < r and nums[r] == nums[r - 1]:
                        r -= 1
                    l += 1
                    r -= 1
        
        return res

