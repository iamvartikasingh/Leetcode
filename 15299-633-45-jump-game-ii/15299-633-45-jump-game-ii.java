class Solution {
    public int jump(int[] nums) {
       int res=0;
       int l=0;
       int r=0;
       while (r<nums.length-1){
        int farthest=1;
        for(int i=l; i<r+1 ; i++){
            farthest=Math.max(farthest,i+nums[i]);
        }
                    l=r+1;
                    r=farthest;
                    res+=1;
       }
        return res;
    }
}