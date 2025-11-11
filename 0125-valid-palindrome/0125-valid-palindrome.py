class Solution:
    def isPalindrome(self, s: str) -> bool:
        newStr = ""
        for c in s:
            if c.isalnum():
                newStr+=c.lower()
        return newStr==newStr[::-1]
    #     x=0
    #     y=len(s)-1
    #     while x<y:
    #         while x<y and not self.alphaNum(s[x]):
    #             x+=1
    #         while y>x and not self.alphaNum(s[y]):
    #             y-=1
    #         if s[x].lower() !=s[y].lower():
    #             return False
           
    #         x+=1
    #         y-=1
    #     return True
    # def alphaNum(self, c):
    #     return(ord('A') <= ord(c)<= ord('Z')
    #            or ord('a') <= ord(c)<= ord('z') or
    #            ord('0') <= ord(c)<= ord('9'))


        