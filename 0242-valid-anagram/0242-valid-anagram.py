class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False  # quick sanity check

        charc = {}

        # Count frequency in s
        for c in s:
            charc[c] = charc.get(c, 0) + 1

        # Subtract frequency using t
        for c in t:
            if c not in charc:
                return False
            charc[c] -= 1
            if charc[c] == 0:
                del charc[c]

        return not charc  # True if dict empty, False otherwise