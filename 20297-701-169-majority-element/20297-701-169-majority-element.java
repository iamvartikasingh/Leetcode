class Solution {
    public int majorityElement(int[] nums) {
      int k=0;
      int t=0;
      for(int s:nums){
        if(k == 0){
            t=s;
        }
        if(s == t){
            k++;
        }
else{
    k--;
}}
      return t;
    }
}