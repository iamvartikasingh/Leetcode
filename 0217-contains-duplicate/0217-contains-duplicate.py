class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        freq = {}
        for x in nums:
            if x in freq:
                freq[x]+=1
                return True
            else:
                freq[x] =1
        
        return False