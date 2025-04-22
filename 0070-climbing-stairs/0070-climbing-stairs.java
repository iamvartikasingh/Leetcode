class Solution {
    public int climbStairs(int n) {
       int one=1, two=1;
       int i=0, temp=0;
       
       while(i<n-1){
            temp=one;
            one=two+one;
            two=temp;



        i++;

       }
       return one;
    }
}